package in.clouthink.lutra.sample.support.view;

import in.clouthink.lutra.sample.model.Payment;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentView {

    public static PaymentView from(Payment payment) {
        PaymentView result = new PaymentView();
        BeanUtils.copyProperties(payment, result);
        if (payment.getRental() != null) {
            result.setRentalId(payment.getRental().getId());
        }
        if (payment.getCustomer() != null) {
            result.setCustomerId(payment.getCustomer().getId());
            result.setCustomerFirstName(payment.getCustomer().getFirstName());
            result.setCustomerLastName(payment.getCustomer().getLastName());
        }
        if (payment.getStaff() != null) {
            result.setStaffId(payment.getStaff().getId());
            result.setStaffFirstName(payment.getStaff().getFirstName());
            result.setStaffLastName(payment.getStaff().getLastName());
        }
        return result;
    }

    private Integer id;

    private Integer customerId;

    private String customerFirstName;

    private String customerLastName;

    private Integer staffId;

    private String staffFirstName;

    private String staffLastName;

    private Integer rentalId;

    private BigDecimal amount;

    private Date payAt;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffFirstName() {
        return staffFirstName;
    }

    public void setStaffFirstName(String staffFirstName) {
        this.staffFirstName = staffFirstName;
    }

    public String getStaffLastName() {
        return staffLastName;
    }

    public void setStaffLastName(String staffLastName) {
        this.staffLastName = staffLastName;
    }

    public Integer getRentalId() {
        return rentalId;
    }

    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getPayAt() {
        return payAt;
    }

    public void setPayAt(Date payAt) {
        this.payAt = payAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
