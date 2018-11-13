package project.article;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArticleDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public Object list() {
		return sqlSessionTemplate.selectList("article.list");
	}

	public Object insertOne(ArticleDTO dto) {
		return sqlSessionTemplate.insert("article.insertOne", dto);
	}

	public Object selectOne(Object a_id) {
		return sqlSessionTemplate.selectOne("article.selectOne", a_id);
	}

	public Object deleteOne(ArticleDTO dto) {
		return sqlSessionTemplate.delete("article.deleteOne", dto);
	}

	public Object modifyOne(ArticleDTO dto) {
		return sqlSessionTemplate.update("article.modifyOne", dto);
	}
}
