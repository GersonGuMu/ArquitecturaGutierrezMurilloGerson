<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use App\Models\User;
use Illuminate\Support\Facades\Hash;

class UsersSeeder extends Seeder
{
    public function run()
    {
        User::updateOrCreate(
            ['email' => 'gerson@gmail.com'],
            [
                'name' => 'Gerson',
                'password' => Hash::make('123'),
                'is_admin' => true,
            ]
        );
    }
}
