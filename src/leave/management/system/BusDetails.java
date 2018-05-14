/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leave.management.system;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author User-PC
 */
@Entity
@Table(name = "bus_details", catalog = "leaves", schema = "")
@NamedQueries({
    @NamedQuery(name = "BusDetails.findAll", query = "SELECT b FROM BusDetails b")
    , @NamedQuery(name = "BusDetails.findById", query = "SELECT b FROM BusDetails b WHERE b.id = :id")
    , @NamedQuery(name = "BusDetails.findByBusNo", query = "SELECT b FROM BusDetails b WHERE b.busNo = :busNo")
    , @NamedQuery(name = "BusDetails.findByBusSource", query = "SELECT b FROM BusDetails b WHERE b.busSource = :busSource")
    , @NamedQuery(name = "BusDetails.findByBusDest", query = "SELECT b FROM BusDetails b WHERE b.busDest = :busDest")})
public class BusDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "bus_no")
    private String busNo;
    @Basic(optional = false)
    @Column(name = "bus_source")
    private String busSource;
    @Basic(optional = false)
    @Column(name = "bus_dest")
    private String busDest;

    public BusDetails() {
    }

    public BusDetails(Integer id) {
        this.id = id;
    }

    public BusDetails(Integer id, String busNo, String busSource, String busDest) {
        this.id = id;
        this.busNo = busNo;
        this.busSource = busSource;
        this.busDest = busDest;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        String oldBusNo = this.busNo;
        this.busNo = busNo;
        changeSupport.firePropertyChange("busNo", oldBusNo, busNo);
    }

    public String getBusSource() {
        return busSource;
    }

    public void setBusSource(String busSource) {
        String oldBusSource = this.busSource;
        this.busSource = busSource;
        changeSupport.firePropertyChange("busSource", oldBusSource, busSource);
    }

    public String getBusDest() {
        return busDest;
    }

    public void setBusDest(String busDest) {
        String oldBusDest = this.busDest;
        this.busDest = busDest;
        changeSupport.firePropertyChange("busDest", oldBusDest, busDest);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusDetails)) {
            return false;
        }
        BusDetails other = (BusDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "leave.management.system.BusDetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
