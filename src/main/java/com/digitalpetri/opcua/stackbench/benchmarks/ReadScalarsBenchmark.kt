package com.digitalpetri.opcua.stackbench.benchmarks

import com.typesafe.config.Config
import org.eclipse.milo.opcua.sdk.client.OpcUaClient
import org.eclipse.milo.opcua.stack.core.AttributeId
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName
import org.eclipse.milo.opcua.stack.core.types.structured.ReadValueId


class ReadScalarsBenchmark(client: OpcUaClient, config: Config) : ReadBenchmark(client, config) {

    override fun getName(): String = "ReadScalars"

    override fun getNodesToRead(): List<ReadValueId> {
        return scalarNodeIds.map {
            ReadValueId(
                it,
                AttributeId.Value.uid(),
                null, QualifiedName.NULL_VALUE
            )
        }
    }

}