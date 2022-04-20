package com.jsh.erp.datasource.mappers;
import com.jsh.erp.datasource.entities.MaterialCurrentStockBackups;
import com.jsh.erp.datasource.entities.MaterialCurrentStockBackupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialCurrentStockBackupsMapper {
    long countByExample(MaterialCurrentStockBackups example);

    int deleteByExample(MaterialCurrentStockBackupsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MaterialCurrentStockBackups record);

    int insertSelective(MaterialCurrentStockBackups record);

    List<MaterialCurrentStockBackups> selectByExample(MaterialCurrentStockBackupsExample example);

    MaterialCurrentStockBackups selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MaterialCurrentStockBackups record, @Param("example") MaterialCurrentStockBackupsExample example);

    int updateByExample(@Param("record") MaterialCurrentStockBackups record, @Param("example") MaterialCurrentStockBackupsExample example);

    int updateByPrimaryKeySelective(MaterialCurrentStockBackups record);

    int updateByPrimaryKey(MaterialCurrentStockBackups record);
}