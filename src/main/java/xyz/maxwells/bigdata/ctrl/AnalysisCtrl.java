package xyz.maxwells.bigdata.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.maxwells.bigdata.domain.RequestResult;
import xyz.maxwells.bigdata.domain.data.Analysis;
import xyz.maxwells.bigdata.service.AnalysisService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuzusheng on 2018/4/16.
 */
@RestController
@RequestMapping("/analysis")
public class AnalysisCtrl {
    @Autowired
    private AnalysisService service;
    @RequestMapping("/find")
    public RequestResult findByIndicator(String indicator){
            String[] indicatorsql = indicator.split(",");
            List<Analysis> result = new ArrayList<>();
            for (int i = 0;i<indicatorsql.length;i++){
                result.add(service.findByindicator(indicatorsql[i].trim()));
            }
            return new RequestResult(result);
    }
}
