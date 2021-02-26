package generate;

import generate.Person;

/**
 * @Entity generate.Person
 */
public interface PersonDao {
    /**
     *
     * @mbg.generated 2021-02-26 10:22:27
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-02-26 10:22:27
     */
    int insert(Person record);

    /**
     *
     * @mbg.generated 2021-02-26 10:22:27
     */
    int insertSelective(Person record);

    /**
     *
     * @mbg.generated 2021-02-26 10:22:27
     */
    Person selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-02-26 10:22:27
     */
    int updateByPrimaryKeySelective(Person record);

    /**
     *
     * @mbg.generated 2021-02-26 10:22:27
     */
    int updateByPrimaryKey(Person record);
}