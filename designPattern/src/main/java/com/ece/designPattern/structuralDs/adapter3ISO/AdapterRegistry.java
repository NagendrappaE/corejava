package com.ece.designPattern.structuralDs.adapter3ISO;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class AdapterRegistry {

	private final Map<String, Function<Object, MessageAdapter<?>>> registry = new HashMap<>();

    public void register(String key, Function<Object, MessageAdapter<?>> creator) {
        registry.put(key, creator);
    }

    public MessageAdapter<?> getAdapter(String key, Object input) {
        if (!registry.containsKey(key)) {
            throw new IllegalArgumentException("No adapter registered for: " + key);
        }
        return registry.get(key).apply(input);
    }
}
