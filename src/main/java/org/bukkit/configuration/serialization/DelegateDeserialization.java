package org.bukkit.configuration.serialization;

import org.bukkit.configuration.serialization.ConfigurationSerializable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(value=RetentionPolicy.RUNTIME) @Target(value=ElementType.TYPE) public @interface DelegateDeserialization  {

}
