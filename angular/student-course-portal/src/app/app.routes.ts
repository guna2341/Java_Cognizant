import { Routes } from '@angular/router';
import { Home } from './pages/home/home';
import { Course } from './pages/course/course';
import { StudentProfile } from './pages/student-profile/student-profile';

export const routes: Routes = [
  { path: '', component: Home },
  { path: 'course', component: Course },
  { path: 'student-profile', component: StudentProfile }
];