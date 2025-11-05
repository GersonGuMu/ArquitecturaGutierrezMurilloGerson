<?php

namespace Database\Factories;

use App\Models\Especialidad;
use Illuminate\Database\Eloquent\Factories\Factory;

class MedicoFactory extends Factory
{
    public function definition()
    {
        // Asegurarse que exista alguna especialidad
        $especialidad = Especialidad::inRandomOrder()->first() ?? Especialidad::factory()->create();

        return [
            'nombre_completo' => $this->faker->name(),
            'especialidad_id' => $especialidad->id,
            'telefono' => $this->faker->phoneNumber(),
            'email' => $this->faker->unique()->safeEmail(),
            'estado' => $this->faker->randomElement(['activo','inactivo']),
        ];
    }
}
