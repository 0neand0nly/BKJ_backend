package com.example.bjk_backend.mapper;
import com.example.bjk_backend.domain.cweVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface cweMapper {
    List<cweVo> select();
    void insert(cweVo vo);

}
