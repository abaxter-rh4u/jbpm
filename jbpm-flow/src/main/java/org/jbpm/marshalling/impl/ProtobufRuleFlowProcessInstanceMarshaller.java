/**
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.marshalling.impl;

import org.jbpm.ruleflow.instance.RuleFlowProcessInstance;
import org.jbpm.workflow.instance.impl.WorkflowProcessInstanceImpl;

/**
 * Marshaller class for RuleFlowProcessInstances
 * 
 * @author <a href="mailto:kris_verlaenen@hotmail.com">Kris Verlaenen</a>
 * @author mfossati
 */

public class ProtobufRuleFlowProcessInstanceMarshaller extends
		AbstractProtobufProcessInstanceMarshaller {

	public static ProtobufRuleFlowProcessInstanceMarshaller INSTANCE = new ProtobufRuleFlowProcessInstanceMarshaller();

	private ProtobufRuleFlowProcessInstanceMarshaller() {
	}

	protected WorkflowProcessInstanceImpl createProcessInstance() {
		return new RuleFlowProcessInstance();
	}

}