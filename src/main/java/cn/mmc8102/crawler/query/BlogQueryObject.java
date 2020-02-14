package cn.mmc8102.crawler.query;

import org.springframework.util.StringUtils;

import lombok.Getter;
import lombok.Setter;

/**
 * 课程高级查询对象
 * @author 16282
 *
 */
@Getter
@Setter
public class BlogQueryObject extends QueryObject {
	private Long id;
	/**
	 * 关键字查询
	 */
	private String keyWord;
	
	public String getKeyWord() {
		return StringUtils.hasLength(keyWord)?keyWord:null;
	}
}
