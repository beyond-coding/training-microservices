package com.beyondcoding.teahouse.dessertexpert;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding({Binding.class})
public class BindingConfiguration {
}
