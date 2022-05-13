/*
 Program to mergesort for positve Integer
 Author: Dongseok K. Programmer
 E-mail Address: dsk0820@naver.com
 Programming Active Learning 1
 Last changed: May 12, 2022
 */
public class MergeSort {
	private int[] arr;
	private int[] arr_copy;

	// integer 형태의 배열 주소 복사 및 추가 로 생성된 배열 길이 정의
	public MergeSort(int[] num) {
		arr = num;
		arr_copy = new int[arr.length];
	}

	// 정렬 메소드
	public void sort() {
		merge_sort(0, arr.length - 1);
	}

	// mergesort 분열
	private void merge_sort(int left, int right) {
		int mid;
		if (right > left) {
			// 배열 인덱스 가운대를 기준으로 왼쪽 오른쪽으로 나누어 분열
			mid = (left + right) / 2;
			merge_sort(left, mid);
			merge_sort(mid + 1, right);
			// 분열된 배열을 정렬 및 정복
			merge(left, mid, right);
		}
	}

	// mergesort 정렬 및 정복
	private void merge(int left, int mid, int right) {
		int i, j, k, l;
		i = left;
		j = mid + 1;
		k = left;
		// 왼쪽 또는 오른쪽, 둘중 하나라도 모두 정렬되어 다른 배열에 저장될때까지 정렬후 탈출
		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j])
				arr_copy[k++] = arr[i++];
			else
				arr_copy[k++] = arr[j++];
		}
		//왼족이 먼저 정렬이 되었을때 남은 오른쪽을 배열에 그대로 삽입
		if (i > mid) {
			for (l = j; l <= right; l++)
				arr_copy[k++] = arr[l];
		} 
		//오른쪽이 먼저 정렬이 되었을때 남은 왼쪽을 배열에 그대로 삽입
		else {
			for (l = i; l <= mid; l++)
				arr_copy[k++] = arr[l];
		}
		// 저장된 배열을 원래 배열에 삽입
		for (l = left; l <= right; l++) {
			arr[l] = arr_copy[l];
		}
	}
}
