package xyz.maxwells.bigdata.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 * Created by wuzusheng on 2018/3/26.
 */
public class VuePageable {
    //pageNumber
    @Getter @Setter private int page = 1;
    //pageSize
    @Getter @Setter private int limit = 10;
    @Getter @Setter private String sort = "id";
    @Getter @Setter private String dir = "ASC";
    public Pageable getPageable(){
        Sort sort = new Sort(Sort.Direction.ASC,this.sort);

        if (this.dir.equals("DESC")){
            sort = new Sort(Sort.Direction.DESC,this.sort);
        }
        return new PageRequest(this.page-1,this.limit,sort);
    }
}
