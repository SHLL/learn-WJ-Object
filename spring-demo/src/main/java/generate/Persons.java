package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * null
 * @TableName persons
 */
@Data
public class Persons implements Serializable {
    /**
     * 
     *
     * @mbg.generated 2021-02-26 10:27:05
     */
    private Integer id;

    /**
     * 
     *
     * @mbg.generated 2021-02-26 10:27:05
     */
    private String username;

    /**
     * 
     *
     * @mbg.generated 2021-02-26 10:27:05
     */
    private String phone;

    /**
     * 
     *
     * @mbg.generated 2021-02-26 10:27:05
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table persons
     *
     * @mbg.generated 2021-02-26 10:27:05
     */
    private static final long serialVersionUID = 1L;
}