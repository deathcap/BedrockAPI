package org.bukkit.configuration.file;

import java.util.Map;
import java.util.regex.Pattern;
import org.yaml.snakeyaml.nodes.Tag;


public class YamlRepresenter extends org.yaml.snakeyaml.representer.Representer  {


	protected Map<Class<? extends Object>,org.yaml.snakeyaml.nodes.Tag> classTags = null;

	public static Pattern BINARY_PATTERN = null;

	public YamlRepresenter() {
	}

	protected org.yaml.snakeyaml.nodes.Tag getTag(Class<?> arg0, org.yaml.snakeyaml.nodes.Tag arg1) {
		return null;
	}

	public org.yaml.snakeyaml.nodes.Tag addClassTag(Class<? extends Object> arg0, String arg1) {
		return null;
	}

	public org.yaml.snakeyaml.nodes.Tag addClassTag(Class<? extends Object> arg0, org.yaml.snakeyaml.nodes.Tag arg1) {
		return null;
	}
}
