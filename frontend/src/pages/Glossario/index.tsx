import { NavBar } from 'components/NavBar';
import { PageInBuild } from 'components/PageInBuild';
import imgGlo from '../../assets/images/glo.jpg'

export const Glossario = () => {
  return (
    <>
      <div className="container">
        <div className="row">
            <NavBar />
        </div>
        <h1>Glossário</h1>

        <hr />

        <div className="row">
          <img src={imgGlo} alt="" className="img-fluid" />
        </div>
      </div>
    </>
    
  );
}