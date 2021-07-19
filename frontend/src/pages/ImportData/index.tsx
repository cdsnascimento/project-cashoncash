import { NavBar } from 'components/NavBar';
import imgGlo from '../../assets/images/glo.jpg'

export const ImportData = () => {
  return (
    <>
      <div className="container">
        <div className="row">
            <NavBar />
        </div>
        <h1>ImportData</h1>

        <hr />

        <div className="row">
          <img src={imgGlo} alt="" className="img-fluid" />
        </div>
      </div>
    </>
    
  );
}