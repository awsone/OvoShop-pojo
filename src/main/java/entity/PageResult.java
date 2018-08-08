package entity;

import java.io.Serializable;
import java.util.List;
/**
 * 分页结果类
 * @author 大白猫😀😀😀小地瓜
 *
 */
public class PageResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2740111006651432734L;

	private Long total; //总记录数
	private List rows;  //当前页记录
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "PageResult [total=" + total + ", rows=" + rows + "]";
	}
	public PageResult(Long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}






}
