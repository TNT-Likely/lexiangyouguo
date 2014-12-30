package lxyg.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * DailyspecialsId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class DailyspecialsId  implements java.io.Serializable {


    // Fields    

     private Integer proId;
     private Integer id;


    // Constructors

    /** default constructor */
    public DailyspecialsId() {
    }

    
    /** full constructor */
    public DailyspecialsId(Integer proId, Integer id) {
        this.proId = proId;
        this.id = id;
    }

   
    // Property accessors

    @Column(name="Pro_Id", nullable=false)

    public Integer getProId() {
        return this.proId;
    }
    
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    @Column(name="Id", nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DailyspecialsId) ) return false;
		 DailyspecialsId castOther = ( DailyspecialsId ) other; 
         
		 return ( (this.getProId()==castOther.getProId()) || ( this.getProId()!=null && castOther.getProId()!=null && this.getProId().equals(castOther.getProId()) ) )
 && ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getProId() == null ? 0 : this.getProId().hashCode() );
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         return result;
   }   





}