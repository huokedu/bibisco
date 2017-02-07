package com.bibisco.dao.client;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bibisco.dao.model.Locations;
import com.bibisco.dao.model.LocationsExample;

public interface LocationsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	int countByExample(LocationsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	int deleteByExample(LocationsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	int deleteByPrimaryKey(Long idLocation);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	int insert(Locations record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	int insertSelective(Locations record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	List<Locations> selectByExampleWithBLOBs(LocationsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	List<Locations> selectByExample(LocationsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	Locations selectByPrimaryKey(Long idLocation);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	int updateByExampleSelective(@Param("record") Locations record, @Param("example") LocationsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	int updateByExampleWithBLOBs(@Param("record") Locations record, @Param("example") LocationsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	int updateByExample(@Param("record") Locations record, @Param("example") LocationsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	int updateByPrimaryKeySelective(Locations record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	int updateByPrimaryKeyWithBLOBs(Locations record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	int updateByPrimaryKey(Locations record);
	
	int shiftUp( @Param("startPosition")Integer startPosition, @Param("endPosition")Integer endPosition);
	
	int shiftDown(@Param("startPosition")Integer startPosition, @Param("endPosition")Integer endPosition);
	
	void deleteByPosition(Integer position);
}