package xyz.maxwells.bigdata.domain;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuzusheng on 2018/4/19.
 */
public class LogFindDTO {
    @Getter @Setter private Long localId;
    @Getter @Setter private String userName;
    public static Specification<Log> getSpecification(LogFindDTO dto){
        Specification<Log> spec = new Specification<Log>() {
            @Override
            public Predicate toPredicate(Root<Log> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<>();
                if (null != dto && !StringUtils.isEmpty(dto.getLocalId())){
                    Predicate p = cb.like(root.get("localId").as(String.class),"%"+dto.getLocalId()+"%");
                    list.add(p);
                }
                if (null != dto && !StringUtils.isEmpty(dto.getUserName())){
                    Predicate p = cb.like(root.get("userName").as(String.class),"%"+dto.getUserName()+"%");
                    list.add(p);
                }
                Predicate[] p = new Predicate[list.size()];
                return cb.and(list.toArray(p));
            }
        };
        return spec;
    }
}
