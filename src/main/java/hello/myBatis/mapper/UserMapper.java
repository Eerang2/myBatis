package hello.myBatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

@Mapper
@Repository
public interface UserMapper {

    ArrayList<HashMap<String , Objects>> findAll();
}
