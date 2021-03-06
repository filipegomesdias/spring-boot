/*
 * Copyright 2012-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.context.properties;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

/**
 * Container annotation that aggregates several {@link ImportConfigurationPropertiesBean}
 * annotations.
 *
 * @author Phillip Webb
 * @since 2.4.0
 * @see ImportConfigurationPropertiesBean
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableConfigurationProperties
@Import(ImportConfigurationPropertiesBeanRegistrar.class)
public @interface ImportConfigurationPropertiesBeans {

	/**
	 * The contained {@link ImportConfigurationPropertiesBean} annotations.
	 * @return the contained annotations
	 */
	ImportConfigurationPropertiesBean[] value();

}
