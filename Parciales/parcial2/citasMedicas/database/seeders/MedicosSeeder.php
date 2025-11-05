<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use App\Models\Medico;
use App\Models\Especialidad;

class MedicosSeeder extends Seeder
{
    public function run()
    {
        // Si no hay especialidades, crear
        if (Especialidad::count() === 0) {
            $this->call(EspecialidadesSeeder::class);
        }

        // Crear 10 médicos usando factory, cada uno ligado aleatoriamente
        Medico::factory()->count(10)->create();
    }
}
