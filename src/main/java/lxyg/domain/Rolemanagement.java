package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Rolemanagement entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="rolemanagement"
    ,catalog="lxyg"
)

public class Rolemanagement  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private String roleName;
     private String roleDescription;


    // Constructors

    /** default constructor */
    public Rolemanagement() {
    }

	/** minimal constructor */
    public Rolemanagement(Timestamp timeAdd, Timestamp timeUpdate, String roleName) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.roleName = roleName;
    }
    
    /** full constructor */
    public Rolemanagement(Timestamp timeAdd, Timestamp timeUpdate, String roleName, String roleDescription) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.roleName = roleName;
        this.roleDescription = roleDescription;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="Id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="TimeAdd", nullable=false, length=19)

    public Timestamp getTimeAdd() {
        return this.timeAdd;
    }
    
    public void setTimeAdd(Timestamp timeAdd) {
        this.timeAdd = timeAdd;
    }
    
    @Column(name="TimeUpdate", nullable=false, length=19)

    public Timestamp getTimeUpdate() {
        return this.timeUpdate;
    }
    
    public void setTimeUpdate(Timestamp timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
    
    @Column(name="RoleName", nullable=false, length=1024)

    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    @Column(name="RoleDescription", length=1024)

    public String getRoleDescription() {
        return this.roleDescription;
    }
    
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
   








}