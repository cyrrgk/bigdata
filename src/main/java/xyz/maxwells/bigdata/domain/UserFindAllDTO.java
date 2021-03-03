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
 * Created by wuzusheng on 2018/3/26.
 */
public class UserFindAllDTO {
    @Getter @Setter private Long id;
    @Getter @Setter private String username;
    @Getter @Setter private String email;
    @Getter @Setter private Long phone;
    public static Specification<SysUser> getSpecification(UserFindAllDTO dto){
        Specification<SysUser> spec = new Specification<SysUser>() {
            @Override
            public Predicate toPredicate(Root<SysUser> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<>();
                if (null != dto && !StringUtils.isEmpty(dto.getId())){
                    Predicate p = cb.like(root.get("id").as(String.class),"%"+ dto.getId()+"%");
                    list.add(p);
                }
                if (null != dto && !StringUtils.isEmpty(dto.getUsername())){
                    Predicate p = cb.like(root.get("username").as(String.class),"%"+ dto.getUsername()+"%");
                    list.add(p);
                }
                if (null != dto && !StringUtils.isEmpty(dto.getEmail())){
                    Predicate p = cb.like(root.get("email").as(String.class),"%"+ dto.getEmail()+"%");
                    list.add(p);
                }
                if (null != dto && !StringUtils.isEmpty(dto.getPhone())){
                    Predicate p = cb.like(root.get("phone").as(String.class),"%"+ dto.getPhone()+"%");
                    list.add(p);
                }
                Predicate[] p = new Predicate[list.size()];
                return cb.and(list.toArray(p));
            }
        };
        return spec;
    }
}
