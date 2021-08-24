package SpringBasic.mybatis.mapper;

import SpringBasic.mybatis.domain.MybatisDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MapperOne {

    List<MybatisDomain> selectAll(MybatisDomain mybatisDomain);

    MybatisDomain selectOne(long id);

    void saveData(MybatisDomain mybatisDomain);

    void updateData(String email, String password);

    void deleteData(String email);

}
