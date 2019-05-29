

let storageLikes = window.localStorage.getItem('rating');

if(!storageLikes) storageLikes = [];
else storageLikes = JSON.parse(storageLikes);

const savedLikes = [...storageLikes];



const likeBtns  = document.getElementsByClassName('like');
const dislikeBtns  = document.getElementsByClassName('dislike');

const likes = document.getElementsByClassName('likes');
const dislikes = document.getElementsByClassName('dislikes');
const user = document.getElementById('user').innerHTML;

const countRating = () => {
	console.log(savedLikes);
	for(i= 0; i < likes.length; i++) {
		const likeComp = likes[i];
		const id = likeComp.id.split('_')[1];
		
		const likesCount = savedLikes.filter(item => item.id == id && item.state === 1);
		const dislikesCount = savedLikes.filter(item => item.id == id && item.state === -1);
		
		const likeRating = document.getElementById(`likes_${id}`);
		likeRating.innerHTML = likesCount.length;
		
		const dislikeRating = document.getElementById(`dislikes_${id}`);
		dislikeRating.innerHTML = dislikesCount.length
	}
}


countRating();

for(i= 0; i < likeBtns.length; i++) {
	const btn = likeBtns[i]
	
	btn.addEventListener('click', () => {
		console.log('like')
		const id = btn.id.split('_')[1];
		
		const index = savedLikes.findIndex(item => item.id == id && item.userId == user);
		
		if(index < 0) {
			savedLikes.push({
				id,
				userId: user,
				state: 1
			});
			countRating();
		} else {
			
			if(savedLikes[index].state == 0) {
				savedLikes[index].state = 1;
				return countRating();
			} else {
				if(savedLikes[index].state != 1) {
					savedLikes[index].state = 1;
				} else {
					savedLikes[index].state = 0;
				}	
			}
			
			
		}
		
		countRating();
		
	})
} 

for(i= 0; i < dislikeBtns.length; i++) {
	
	const btn = dislikeBtns[i]
	btn.addEventListener('click', () => {
		console.log('dislike')
		const id = btn.id.split('_')[1];
	
const index = savedLikes.findIndex(item => item.id == id && item.userId == user);
		
		if(index < 0) {
			savedLikes.push({
				id,
				userId: user,
				state: -1
			});
			countRating();
		} else {
			
			if(savedLikes[index].state == 0) {
				console.log('DISLLEE');
				savedLikes[index].state = -1;
				return countRating();
			} else {
				if(savedLikes[index].state != -1) {
					savedLikes[index].state = -1;
				} else {
					console.log('0000');
					savedLikes[index].state = 0;
				}	
			}
			
			
		}
		
		countRating();
		
	})
} 

window.addEventListener("beforeunload", function(e){
	   window.localStorage.setItem('rating', JSON.stringify(savedLikes));
}, false);