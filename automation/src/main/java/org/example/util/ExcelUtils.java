package org.example.util;

import com.poiji.bind.Poiji;
import com.poiji.option.PoijiOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Component
public class ExcelUtils {
    private static final Logger log = LoggerFactory.getLogger(ExcelUtils.class);

    public ExcelUtils(){}

    public <T> List<T> retrieveExcelData(Class<T> typeClass, String sourceFile, PoijiOptions... poijiOptions){
        log.debug("[IAF] Retrieving excel data for model: {} from {}", typeClass.getSimpleName(), sourceFile);
        PoijiOptions opt = PoijiOptions.PoijiOptionsBuilder.settings().preferNullOverDefault(false).addListDelimiter(";").caseInsensitive(true)
                .ignoreHiddenSheets(true).build();
        if(poijiOptions.length >= 1){
            opt = poijiOptions[0];
            log.debug("[IAF] Excel reader is using user-defined POIJI options");
        }

        long debugStartTime = System.nanoTime();
        List<T> data = Poiji.fromExcel(new File(sourceFile), typeClass);
        log.info("[IAF] Excel reading for model {} took: {}ms", typeClass.getSimpleName(),(System.nanoTime() - debugStartTime)/1000000L);
        return data;
    }
}
