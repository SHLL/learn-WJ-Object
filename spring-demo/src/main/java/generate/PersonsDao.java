package generate;

import generate.Persons;

/**
 * @Entity generate.Persons
 */
public interface PersonsDao {
    /**
     *
     * @mbg.generated 2021-02-26 10:27:05
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-02-26 10:27:05
     */
    int insert(Persons record);

    /**
     *
     * @mbg.generated 2021-02-26 10:27:05
     */
    int insertSelective(Persons record);

    /**
     *
     * @mbg.generated 2021-02-26 10:27:05
     */
    Persons selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-02-26 10:27:05
     */
    int updateByPrimaryKeySelective(Persons record);

    /**
     *
     * @mbg.generated 2021-02-26 10:27:05
     */
    int updateByPrimaryKey(Persons record);
}