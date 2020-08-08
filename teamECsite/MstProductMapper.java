package jp.co.internous.node.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.node.model.domain.MstProduct;

@Mapper
public interface MstProductMapper {
	@Select("SELECT * FROM mst_product")
	List<MstProduct> findAll();
	
	@Select("SELECT * FROM mst_product WHERE id = #{id}")
	MstProduct findByProductId(@Param("id") long id);
	
	List<MstProduct> findByProductName(@Param("productName") String[] productName);
	
	List<MstProduct> findByCategoryIdAndProductName(@Param("categoryId") long categoryId, @Param("productName") String[] productName);

}
