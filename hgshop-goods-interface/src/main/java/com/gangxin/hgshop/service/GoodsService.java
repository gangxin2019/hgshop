package com.gangxin.hgshop.service;

import java.util.List;

import com.gangxin.hgshop.pojo.Brand;
import com.gangxin.hgshop.pojo.Category;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author GX
 ***** Dubbo 服务接口函数不要有非Void 的返回值********
 */
public interface GoodsService {

	/**
	 * 品牌单表的增删改
	 * @param brand
	 * @return
	 */
	int addBrand(Brand brand);
	int updateBrand(Brand brand);
	int deleteBrand(Integer id);
	
	/**
	 * 
	 * @param firstChar 首字母
	 * @param page 页码
	 * @return
	 */
	PageInfo<Brand> listBrand(String firstChar,int page);
	
	/**
	 * 分类表的增删改
	 * @param category
	 * @return
	 */
	int addCategory(Category category);
	int updateCategory(Category category);
	int deleteCategory(Integer id);
	
	/**
	 * 
	 * @param firstChar 首字母
	 * @param page 页码
	 * @return
	 */
	PageInfo<Category> listCategory(String firstChar,int page);
	
	/**
	 * 以树的形式显示列表
	 * @return
	 */
	List<Category> treeCategory(); 
	
}
