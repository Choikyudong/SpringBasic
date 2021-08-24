package SpringBasic.mybatis.service;

import SpringBasic.mybatis.domain.MybatisDomain;
import SpringBasic.mybatis.mapper.MapperOne;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MybatisService {

    private final MapperOne mapperOne;

    public MybatisService(MapperOne mapperOne) {
        this.mapperOne = mapperOne;
    }

    public List<MybatisDomain> selectAll(MybatisDomain mybatisDomain) {
        List<MybatisDomain> table = mapperOne.selectAll(mybatisDomain);
        return table;
    }

    public MybatisDomain selectOne(long id) {
        MybatisDomain domain = mapperOne.selectOne(id);
        return domain;
    }

    public void saveData (MybatisDomain mybatisDomain) {
        mapperOne.saveData(mybatisDomain);
    }

    public void updateData (String email, String password) {
        mapperOne.updateData(email, password);
    }

    public void deleteData (String email) {
        mapperOne.deleteData(email);
    }

}
