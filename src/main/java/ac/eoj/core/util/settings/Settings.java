package ac.eoj.core.util.settings;

import lombok.Data;
import org.apache.commons.io.IOUtils;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

@Data
public class Settings {
	public static TMySQL MYSQL;
	public static TRedis REDIS;
	public static TCore CORE;
	public static TRepos REPOS;
	public static TOSS OSS;
	public static TQueue QUEUE;
	public static TJudger JUDGER;
	public static TPath PATH;

	public static void init(String confPath) throws IOException {
		InputStream in = new FileInputStream(new File(confPath));
		String confContent = IOUtils.toString(in, Charset.forName("UTF-8"));
		Settings settings = new Yaml(new Constructor(Settings.class)).load(confContent);
		MYSQL = settings.mysql;
		REDIS = settings.redis;
		CORE = settings.core;
		REPOS = settings.repos;
		OSS = settings.oss;
		QUEUE = settings.queue;
		JUDGER = settings.judger;
		PATH = settings.path;
	}

	private TMySQL mysql;
	private TRedis redis;
	private TCore core;
	private TRepos repos;
	private TOSS oss;
	private TQueue queue;
	private TJudger judger;
	private TPath path;

	@Data
	public static class TMySQL {
		public String host;
		public Integer port;
		public String username;
		public String password;
		public String database;

		public TMySQL() {
			this.host = "127.0.0.1";
			this.port = 3306;
			this.database = "eoj";
		}
	}

	@Data
	public static class TRedis {
		public String host;
		public Integer port;

		public TRedis() {
			this.host = "127.0.0.1";
			this.port = 6379;
		}
	}

	@Data
	public static class TCore {
		public TCoreHTTP http;

		private TCore() {
			this.http = new TCoreHTTP();
		}

		@Data
		public static class TCoreHTTP {
			public Integer port;

			private TCoreHTTP() {
				this.port = 8080;
			}
		}
	}

	@Data
	public static class TRepos {
		public String[] hosts;
		public Integer port;
		public TReposHTTP http;
		public String path;

		private TRepos() {
			this.port = 3000;
			this.http = new TReposHTTP();
			this.path = "/dev/shm/eoj/repos";
		}

		@Data
		public static class TReposHTTP {
			public Integer port;
			public Boolean log;

			private TReposHTTP() {
				this.port = 8090;
				this.log = false;
			}
		}
	}

	@Data
	public static class TOSS {
		public String[] hosts;
		public Integer port;
		public String backend;

		private TOSS() {
			this.port = 3100;
		}
	}

	@Data
	public static class TQueue {
		public String[] hosts;
		public Integer port;

		private TQueue() {
			this.port = 3200;
		}
	}

	@Data
	public static class TJudger {
		public Integer worker;
		public String path;
		public String docker;

		private TJudger() {
			this.worker = Runtime.getRuntime().availableProcessors();
			this.path = "/dev/shm/eoj/judger";
			this.docker = "unix:///var/run/docker.sock";
		}
	}

	@Data
	public static class TPath {
		public String git;
		public String tar;
		public String executor;

		private TPath() {
			this.git = "/usr/bin/git";
			this.tar = "/usr/bin/tar";
			this.executor = "/opt/eoj/bin/executor";
		}
	}
}
