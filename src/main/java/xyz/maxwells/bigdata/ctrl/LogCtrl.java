package xyz.maxwells.bigdata.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.maxwells.bigdata.domain.Log;
import xyz.maxwells.bigdata.domain.LogFindDTO;
import xyz.maxwells.bigdata.domain.RequestResult;
import xyz.maxwells.bigdata.domain.VuePageable;
import xyz.maxwells.bigdata.service.LogService;

/**
 * Created by wuzusheng on 2018/4/19.
 */

@RestController
public class LogCtrl {
    @Autowired
    private LogService service;
    @RequestMapping("/log")
    public RequestResult list(LogFindDTO dto, VuePageable pageable){
        pageable.setSort("date");
        pageable.setDir("DESC");
        Page<Log> page = service.list(LogFindDTO.getSpecification(dto),pageable.getPageable());
        return new RequestResult(page);
    }

}
