package common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 社員テーブルのエンティティクラスです。
 *
 * @author Hiroshi HASEGAWA
 */
@Entity
public class Employee {

    @Id
    private Long employId;

    @Column
    private String name;

    @Column
    private String mail;

    @Column
    private String password;
}
