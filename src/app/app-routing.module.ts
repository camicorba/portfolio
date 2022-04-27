import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
//aca se importan los componentes

const routes: Routes = [
  //Aca van las rutas {path:'', component:pagina1 }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
