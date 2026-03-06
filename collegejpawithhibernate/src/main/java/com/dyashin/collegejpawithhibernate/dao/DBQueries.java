package com.dyashin.collegejpawithhibernate.dao;

public interface DBQueries {
	String namedQuery = "select c from CollegeDTO c where c.name = :nam";
	String count = "select count(c) from CollegeDTO c";
	String min = "select min(c.fee) from CollegeDTO c";
	String max = "select max(c.fee) from CollegeDTO c";
	String avg = "select avg(c.fee) from CollegeDTO c";
	String nativeSQL = "select * from collegedto where location=:loc";
	String jpql = "select c from CollegeDTO c";
}
