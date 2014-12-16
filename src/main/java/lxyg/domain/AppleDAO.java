package lxyg.domain;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Apple
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see hibernate.domain.Apple
 * @author MyEclipse Persistence Tools
 */
public class AppleDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(AppleDAO.class);

	public void save(Apple transientInstance) {
		log.debug("saving Apple instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Apple persistentInstance) {
		log.debug("deleting Apple instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Apple findById(java.lang.String id) {
		log.debug("getting Apple instance with id: " + id);
		try {
			Apple instance = (Apple) getSession().get("lxyg.domain.Apple",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Apple> findByExample(Apple instance) {
		log.debug("finding Apple instance by example");
		try {
			List<Apple> results = (List<Apple>) getSession()
					.createCriteria("hibernate.domain.Apple")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Apple instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Apple as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Apple instances");
		try {
			String queryString = "from Apple";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Apple merge(Apple detachedInstance) {
		log.debug("merging Apple instance");
		try {
			Apple result = (Apple) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Apple instance) {
		log.debug("attaching dirty Apple instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Apple instance) {
		log.debug("attaching clean Apple instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}