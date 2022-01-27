import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'genderFormat'
})
export class GenderPipe implements PipeTransform {
  //accept & return solution  beside the name like mr. or ms.
  //{{e.name | genderFormat:e.gender}}

  transform(value: string, gen: string): string {
    if(gen=='Male')
    {
      return 'Mr, '+value;
    }
    else{
      return 'Ms, '+value;

    }
  }

}
