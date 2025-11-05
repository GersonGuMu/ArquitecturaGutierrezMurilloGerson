<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use App\Models\Especialidad;

class EspecialidadesSeeder extends Seeder
{
    public function run()
    {
        $especialidades = [
            ['nombre' => 'Pediatría', 'descripcion' => 'Atención y cuidado de niños.'],
            ['nombre' => 'Cardiología', 'descripcion' => 'Especialidad del corazón.'],
            ['nombre' => 'Odontología', 'descripcion' => 'Salud bucal y dental.'],
            ['nombre' => 'Ginecología', 'descripcion' => 'Salud reproductiva femenina.'],
        ];

        foreach ($especialidades as $esp) {
            Especialidad::create($esp);
        }
    }
}
