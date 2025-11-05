<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;
use App\Models\Curso;     // ✅ Importar el modelo Curso
use App\Models\Persona;   // ✅ Importar el modelo Persona
/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Inscripciones>
 */
class InscripcionesFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        return [
            'curso_id' => Curso::inRandomOrder()->first()->id, 
            'persona_id' => Persona::inRandomOrder()->first()->id, 
            'fecha' => $this->faker->dateTimeBetween('-1 years', 'now'), 
            'monto' => $this->faker->randomFloat(2, 50, 1000),
        ];
    }
}
