.class public final Ldz5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/List;

.field public e:I

.field public f:I

.field public g:Lcz5;

.field public final synthetic h:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldz5;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ldz5;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Ldz5;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Ldz5;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Ldz5;->d:Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    iput p1, p0, Ldz5;->e:I

    .line 31
    .line 32
    iput p1, p0, Ldz5;->f:I

    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method


# virtual methods
.method public final a(Llz5;Z)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Llz5;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Llz5;->a:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, Ldz5;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->G0:Lnz5;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-object v2, v2, Lnz5;->A:Lmz5;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v2, Lmz5;->A:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lk4;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v3

    .line 27
    :goto_0
    invoke-static {v0, v2}, Le58;->m(Landroid/view/View;Lk4;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    if-eqz p2, :cond_3

    .line 31
    .line 32
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->I:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-gtz v0, :cond_2

    .line 39
    .line 40
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->z0:Liz5;

    .line 41
    .line 42
    if-eqz p2, :cond_3

    .line 43
    .line 44
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->B:Lkg5;

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Lkg5;->N(Llz5;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 p0, 0x0

    .line 51
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lku4;->a()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    :goto_1
    iput-object v3, p1, Llz5;->s:Lpy5;

    .line 63
    .line 64
    iput-object v3, p1, Llz5;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 65
    .line 66
    invoke-virtual {p0}, Ldz5;->c()Lcz5;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget p2, p1, Llz5;->f:I

    .line 74
    .line 75
    invoke-virtual {p0, p2}, Lcz5;->a(I)Lbz5;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v0, v0, Lbz5;->a:Ljava/util/ArrayList;

    .line 80
    .line 81
    iget-object p0, p0, Lcz5;->a:Landroid/util/SparseArray;

    .line 82
    .line 83
    invoke-virtual {p0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Lbz5;

    .line 88
    .line 89
    iget p0, p0, Lbz5;->b:I

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-gt p0, p2, :cond_4

    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    invoke-virtual {p1}, Llz5;->m()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    return-void
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method public final b(I)I
    .locals 4

    .line 1
    iget-object p0, p0, Ldz5;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->z0:Liz5;

    .line 4
    .line 5
    if-ltz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Liz5;->b()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge p1, v1, :cond_1

    .line 12
    .line 13
    iget-boolean v0, v0, Liz5;->g:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->z:Lo9;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, p1, v0}, Lo9;->v(II)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 27
    .line 28
    const-string v2, "invalid position "

    .line 29
    .line 30
    const-string v3, ". State item count is "

    .line 31
    .line 32
    invoke-static {p1, v2, v3}, Lpb4;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v0}, Liz5;->b()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final c()Lcz5;
    .locals 2

    .line 1
    iget-object v0, p0, Ldz5;->g:Lcz5;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcz5;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lcz5;->a:Landroid/util/SparseArray;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lcz5;->b:I

    .line 19
    .line 20
    iput-object v0, p0, Ldz5;->g:Lcz5;

    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, Ldz5;->g:Lcz5;

    .line 23
    .line 24
    return-object p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final d(I)Landroid/view/View;
    .locals 2

    .line 1
    const-wide v0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, v1, p1}, Ldz5;->j(JI)Llz5;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-object p0, p0, Llz5;->a:Landroid/view/View;

    .line 11
    .line 12
    return-object p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldz5;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ldz5;->f(I)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->S0:[I

    .line 21
    .line 22
    iget-object p0, p0, Ldz5;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->y0:Ltt2;

    .line 25
    .line 26
    iget-object v0, p0, Ltt2;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, [I

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    const/4 v1, -0x1

    .line 33
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 v0, 0x0

    .line 37
    iput v0, p0, Ltt2;->d:I

    .line 38
    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final f(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldz5;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Llz5;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {p0, v1, v2}, Ldz5;->a(Llz5;Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final g(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llz5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Llz5;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Ldz5;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Llz5;->i()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, Llz5;->n:Ldz5;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ldz5;->k(Llz5;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Llz5;->p()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget p1, v0, Llz5;->j:I

    .line 36
    .line 37
    and-int/lit8 p1, p1, -0x21

    .line 38
    .line 39
    iput p1, v0, Llz5;->j:I

    .line 40
    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Ldz5;->h(Llz5;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, v2, Landroidx/recyclerview/widget/RecyclerView;->h0:Lty5;

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Llz5;->g()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_3

    .line 53
    .line 54
    iget-object p0, v2, Landroidx/recyclerview/widget/RecyclerView;->h0:Lty5;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lty5;->d(Llz5;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final h(Llz5;)V
    .locals 11

    .line 1
    iget-object v0, p0, Ldz5;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->y0:Ltt2;

    .line 4
    .line 5
    invoke-virtual {p1}, Llz5;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, p1, Llz5;->a:Landroid/view/View;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez v2, :cond_f

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_9

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Llz5;->j()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_e

    .line 28
    .line 29
    invoke-virtual {p1}, Llz5;->o()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_d

    .line 34
    .line 35
    iget v2, p1, Llz5;->j:I

    .line 36
    .line 37
    and-int/lit8 v2, v2, 0x10

    .line 38
    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    sget-object v2, Le58;->a:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-virtual {v3}, Landroid/view/View;->hasTransientState()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    move v2, v5

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v2, v4

    .line 52
    :goto_0
    invoke-virtual {p1}, Llz5;->g()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_b

    .line 57
    .line 58
    iget v3, p0, Ldz5;->f:I

    .line 59
    .line 60
    if-lez v3, :cond_9

    .line 61
    .line 62
    iget v3, p1, Llz5;->j:I

    .line 63
    .line 64
    and-int/lit16 v3, v3, 0x20e

    .line 65
    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_2
    iget-object v3, p0, Ldz5;->c:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    iget v7, p0, Ldz5;->f:I

    .line 76
    .line 77
    if-lt v6, v7, :cond_3

    .line 78
    .line 79
    if-lez v6, :cond_3

    .line 80
    .line 81
    invoke-virtual {p0, v4}, Ldz5;->f(I)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v6, v6, -0x1

    .line 85
    .line 86
    :cond_3
    sget-object v7, Landroidx/recyclerview/widget/RecyclerView;->S0:[I

    .line 87
    .line 88
    if-lez v6, :cond_8

    .line 89
    .line 90
    iget v7, p1, Llz5;->c:I

    .line 91
    .line 92
    iget-object v8, v1, Ltt2;->e:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v8, [I

    .line 95
    .line 96
    if-eqz v8, :cond_5

    .line 97
    .line 98
    iget v8, v1, Ltt2;->d:I

    .line 99
    .line 100
    mul-int/lit8 v8, v8, 0x2

    .line 101
    .line 102
    move v9, v4

    .line 103
    :goto_1
    if-ge v9, v8, :cond_5

    .line 104
    .line 105
    iget-object v10, v1, Ltt2;->e:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v10, [I

    .line 108
    .line 109
    aget v10, v10, v9

    .line 110
    .line 111
    if-ne v10, v7, :cond_4

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_4
    add-int/lit8 v9, v9, 0x2

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    add-int/lit8 v6, v6, -0x1

    .line 118
    .line 119
    :goto_2
    if-ltz v6, :cond_7

    .line 120
    .line 121
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    check-cast v7, Llz5;

    .line 126
    .line 127
    iget v7, v7, Llz5;->c:I

    .line 128
    .line 129
    iget-object v8, v1, Ltt2;->e:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v8, [I

    .line 132
    .line 133
    if-eqz v8, :cond_7

    .line 134
    .line 135
    iget v8, v1, Ltt2;->d:I

    .line 136
    .line 137
    mul-int/lit8 v8, v8, 0x2

    .line 138
    .line 139
    move v9, v4

    .line 140
    :goto_3
    if-ge v9, v8, :cond_7

    .line 141
    .line 142
    iget-object v10, v1, Ltt2;->e:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v10, [I

    .line 145
    .line 146
    aget v10, v10, v9

    .line 147
    .line 148
    if-ne v10, v7, :cond_6

    .line 149
    .line 150
    add-int/lit8 v6, v6, -0x1

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_6
    add-int/lit8 v9, v9, 0x2

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_7
    add-int/2addr v6, v5

    .line 157
    :cond_8
    :goto_4
    invoke-virtual {v3, v6, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    move v1, v5

    .line 161
    goto :goto_6

    .line 162
    :cond_9
    :goto_5
    move v1, v4

    .line 163
    :goto_6
    if-nez v1, :cond_a

    .line 164
    .line 165
    invoke-virtual {p0, p1, v5}, Ldz5;->a(Llz5;Z)V

    .line 166
    .line 167
    .line 168
    :goto_7
    move v4, v1

    .line 169
    goto :goto_8

    .line 170
    :cond_a
    move v5, v4

    .line 171
    goto :goto_7

    .line 172
    :cond_b
    move v5, v4

    .line 173
    :goto_8
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Lkg5;

    .line 174
    .line 175
    invoke-virtual {p0, p1}, Lkg5;->N(Llz5;)V

    .line 176
    .line 177
    .line 178
    if-nez v4, :cond_c

    .line 179
    .line 180
    if-nez v5, :cond_c

    .line 181
    .line 182
    if-eqz v2, :cond_c

    .line 183
    .line 184
    const/4 p0, 0x0

    .line 185
    iput-object p0, p1, Llz5;->s:Lpy5;

    .line 186
    .line 187
    iput-object p0, p1, Llz5;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 188
    .line 189
    :cond_c
    return-void

    .line 190
    :cond_d
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    const-string p1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 195
    .line 196
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_e
    new-instance p0, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v1, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 207
    .line 208
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-static {p0, p1}, Lh;->n(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :cond_f
    :goto_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 223
    .line 224
    new-instance v1, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    const-string v2, "Scrapped or attached views may not be recycled. isScrap:"

    .line 227
    .line 228
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1}, Llz5;->i()Z

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string p1, " isAttached:"

    .line 239
    .line 240
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    if-eqz p1, :cond_10

    .line 248
    .line 249
    move v4, v5

    .line 250
    :cond_10
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw p0
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final i(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llz5;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p1, Llz5;->j:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0xc

    .line 8
    .line 9
    iget-object v1, p0, Ldz5;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Llz5;->k()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->h0:Lty5;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Llz5;->c()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v0, Ljm1;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iget-boolean v0, v0, Ljm1;->g:Z

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Llz5;->f()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p0, Ldz5;->b:Ljava/util/ArrayList;

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Ldz5;->b:Ljava/util/ArrayList;

    .line 57
    .line 58
    :cond_2
    iput-object p0, p1, Llz5;->n:Ldz5;

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    iput-boolean v0, p1, Llz5;->o:Z

    .line 62
    .line 63
    iget-object p0, p0, Ldz5;->b:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    :goto_0
    invoke-virtual {p1}, Llz5;->f()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-virtual {p1}, Llz5;->h()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->G:Lpy5;

    .line 82
    .line 83
    iget-boolean v0, v0, Lpy5;->b:Z

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const-string p1, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 93
    .line 94
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    :goto_1
    iput-object p0, p1, Llz5;->n:Ldz5;

    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    iput-boolean v0, p1, Llz5;->o:Z

    .line 106
    .line 107
    iget-object p0, p0, Ldz5;->a:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    return-void
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final j(JI)Llz5;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Ldz5;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView;->z0:Liz5;

    .line 8
    .line 9
    if-ltz v1, :cond_4a

    .line 10
    .line 11
    invoke-virtual {v3}, Liz5;->b()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ge v1, v4, :cond_4a

    .line 16
    .line 17
    iget-boolean v4, v3, Liz5;->g:Z

    .line 18
    .line 19
    const/16 v5, 0x20

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    if-eqz v4, :cond_5

    .line 24
    .line 25
    iget-object v4, v0, Ldz5;->b:Ljava/util/ArrayList;

    .line 26
    .line 27
    if-eqz v4, :cond_4

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    move v9, v8

    .line 37
    :goto_0
    if-ge v9, v4, :cond_2

    .line 38
    .line 39
    iget-object v10, v0, Ldz5;->b:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    check-cast v10, Llz5;

    .line 46
    .line 47
    invoke-virtual {v10}, Llz5;->p()Z

    .line 48
    .line 49
    .line 50
    move-result v11

    .line 51
    if-nez v11, :cond_1

    .line 52
    .line 53
    invoke-virtual {v10}, Llz5;->b()I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-ne v11, v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {v10, v5}, Llz5;->a(I)V

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->G:Lpy5;

    .line 67
    .line 68
    iget-boolean v9, v9, Lpy5;->b:Z

    .line 69
    .line 70
    if-eqz v9, :cond_4

    .line 71
    .line 72
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->z:Lo9;

    .line 73
    .line 74
    invoke-virtual {v9, v1, v8}, Lo9;->v(II)I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-lez v9, :cond_4

    .line 79
    .line 80
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->G:Lpy5;

    .line 81
    .line 82
    invoke-virtual {v10}, Lpy5;->a()I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-ge v9, v10, :cond_4

    .line 87
    .line 88
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->G:Lpy5;

    .line 89
    .line 90
    invoke-virtual {v10, v9}, Lpy5;->b(I)J

    .line 91
    .line 92
    .line 93
    move-result-wide v9

    .line 94
    move v11, v8

    .line 95
    :goto_1
    if-ge v11, v4, :cond_4

    .line 96
    .line 97
    iget-object v12, v0, Ldz5;->b:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    check-cast v12, Llz5;

    .line 104
    .line 105
    invoke-virtual {v12}, Llz5;->p()Z

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    if-nez v13, :cond_3

    .line 110
    .line 111
    iget-wide v13, v12, Llz5;->e:J

    .line 112
    .line 113
    cmp-long v13, v13, v9

    .line 114
    .line 115
    if-nez v13, :cond_3

    .line 116
    .line 117
    invoke-virtual {v12, v5}, Llz5;->a(I)V

    .line 118
    .line 119
    .line 120
    move-object v10, v12

    .line 121
    goto :goto_3

    .line 122
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    :goto_2
    move-object v10, v6

    .line 126
    :goto_3
    if-eqz v10, :cond_6

    .line 127
    .line 128
    const/4 v4, 0x1

    .line 129
    goto :goto_4

    .line 130
    :cond_5
    move-object v10, v6

    .line 131
    :cond_6
    move v4, v8

    .line 132
    :goto_4
    iget-object v9, v0, Ldz5;->a:Ljava/util/ArrayList;

    .line 133
    .line 134
    iget-object v11, v0, Ldz5;->c:Ljava/util/ArrayList;

    .line 135
    .line 136
    if-nez v10, :cond_1c

    .line 137
    .line 138
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    move v12, v8

    .line 143
    :goto_5
    if-ge v12, v10, :cond_9

    .line 144
    .line 145
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    check-cast v13, Llz5;

    .line 150
    .line 151
    invoke-virtual {v13}, Llz5;->p()Z

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    if-nez v14, :cond_8

    .line 156
    .line 157
    invoke-virtual {v13}, Llz5;->b()I

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    if-ne v14, v1, :cond_8

    .line 162
    .line 163
    invoke-virtual {v13}, Llz5;->f()Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-nez v14, :cond_8

    .line 168
    .line 169
    iget-boolean v14, v3, Liz5;->g:Z

    .line 170
    .line 171
    if-nez v14, :cond_7

    .line 172
    .line 173
    invoke-virtual {v13}, Llz5;->h()Z

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    if-nez v14, :cond_8

    .line 178
    .line 179
    :cond_7
    invoke-virtual {v13, v5}, Llz5;->a(I)V

    .line 180
    .line 181
    .line 182
    move-object v10, v13

    .line 183
    const/16 v16, 0x1

    .line 184
    .line 185
    goto/16 :goto_b

    .line 186
    .line 187
    :cond_8
    add-int/lit8 v12, v12, 0x1

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_9
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Lwr0;

    .line 191
    .line 192
    iget-object v10, v10, Lwr0;->z:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v10, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    move v13, v8

    .line 201
    :goto_6
    if-ge v13, v12, :cond_b

    .line 202
    .line 203
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v14

    .line 207
    check-cast v14, Landroid/view/View;

    .line 208
    .line 209
    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llz5;

    .line 210
    .line 211
    .line 212
    move-result-object v15

    .line 213
    const/16 v16, 0x1

    .line 214
    .line 215
    invoke-virtual {v15}, Llz5;->b()I

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-ne v7, v1, :cond_a

    .line 220
    .line 221
    invoke-virtual {v15}, Llz5;->f()Z

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    if-nez v7, :cond_a

    .line 226
    .line 227
    invoke-virtual {v15}, Llz5;->h()Z

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    if-nez v7, :cond_a

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_b
    const/16 v16, 0x1

    .line 238
    .line 239
    move-object v14, v6

    .line 240
    :goto_7
    if-eqz v14, :cond_11

    .line 241
    .line 242
    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llz5;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Lwr0;

    .line 247
    .line 248
    iget-object v12, v10, Lwr0;->y:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v12, Lcp0;

    .line 251
    .line 252
    iget-object v13, v10, Lwr0;->x:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v13, Lay4;

    .line 255
    .line 256
    iget-object v13, v13, Lay4;->x:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v13, Landroidx/recyclerview/widget/RecyclerView;

    .line 259
    .line 260
    invoke-virtual {v13, v14}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 261
    .line 262
    .line 263
    move-result v13

    .line 264
    if-ltz v13, :cond_10

    .line 265
    .line 266
    invoke-virtual {v12, v13}, Lcp0;->d(I)Z

    .line 267
    .line 268
    .line 269
    move-result v15

    .line 270
    if-eqz v15, :cond_f

    .line 271
    .line 272
    invoke-virtual {v12, v13}, Lcp0;->a(I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v10, v14}, Lwr0;->i0(Landroid/view/View;)V

    .line 276
    .line 277
    .line 278
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Lwr0;

    .line 279
    .line 280
    iget-object v12, v10, Lwr0;->y:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v12, Lcp0;

    .line 283
    .line 284
    iget-object v10, v10, Lwr0;->x:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v10, Lay4;

    .line 287
    .line 288
    iget-object v10, v10, Lay4;->x:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    .line 291
    .line 292
    invoke-virtual {v10, v14}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    const/4 v13, -0x1

    .line 297
    if-ne v10, v13, :cond_c

    .line 298
    .line 299
    goto :goto_8

    .line 300
    :cond_c
    invoke-virtual {v12, v10}, Lcp0;->d(I)Z

    .line 301
    .line 302
    .line 303
    move-result v15

    .line 304
    if-eqz v15, :cond_d

    .line 305
    .line 306
    :goto_8
    move v10, v13

    .line 307
    goto :goto_9

    .line 308
    :cond_d
    invoke-virtual {v12, v10}, Lcp0;->b(I)I

    .line 309
    .line 310
    .line 311
    move-result v12

    .line 312
    sub-int/2addr v10, v12

    .line 313
    :goto_9
    if-eq v10, v13, :cond_e

    .line 314
    .line 315
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Lwr0;

    .line 316
    .line 317
    invoke-virtual {v12, v10}, Lwr0;->y(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v14}, Ldz5;->i(Landroid/view/View;)V

    .line 321
    .line 322
    .line 323
    const/16 v10, 0x2020

    .line 324
    .line 325
    invoke-virtual {v7, v10}, Llz5;->a(I)V

    .line 326
    .line 327
    .line 328
    move-object v10, v7

    .line 329
    goto :goto_b

    .line 330
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    const-string v1, "layout index should not be -1 after unhiding a view:"

    .line 333
    .line 334
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-static {v0, v1}, Lrf2;->m(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    return-object v6

    .line 348
    :cond_f
    new-instance v0, Ljava/lang/RuntimeException;

    .line 349
    .line 350
    new-instance v1, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    const-string v2, "trying to unhide a view that was not hidden"

    .line 353
    .line 354
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw v0

    .line 368
    :cond_10
    const-string v0, "view is not a child, cannot hide "

    .line 369
    .line 370
    invoke-static {v0, v14}, Lkj6;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    return-object v6

    .line 374
    :cond_11
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 375
    .line 376
    .line 377
    move-result v7

    .line 378
    move v10, v8

    .line 379
    :goto_a
    if-ge v10, v7, :cond_13

    .line 380
    .line 381
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v12

    .line 385
    check-cast v12, Llz5;

    .line 386
    .line 387
    invoke-virtual {v12}, Llz5;->f()Z

    .line 388
    .line 389
    .line 390
    move-result v13

    .line 391
    if-nez v13, :cond_12

    .line 392
    .line 393
    invoke-virtual {v12}, Llz5;->b()I

    .line 394
    .line 395
    .line 396
    move-result v13

    .line 397
    if-ne v13, v1, :cond_12

    .line 398
    .line 399
    invoke-virtual {v12}, Llz5;->d()Z

    .line 400
    .line 401
    .line 402
    move-result v13

    .line 403
    if-nez v13, :cond_12

    .line 404
    .line 405
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-object v10, v12

    .line 409
    goto :goto_b

    .line 410
    :cond_12
    add-int/lit8 v10, v10, 0x1

    .line 411
    .line 412
    goto :goto_a

    .line 413
    :cond_13
    move-object v10, v6

    .line 414
    :goto_b
    if-eqz v10, :cond_1d

    .line 415
    .line 416
    invoke-virtual {v10}, Llz5;->h()Z

    .line 417
    .line 418
    .line 419
    move-result v7

    .line 420
    if-eqz v7, :cond_14

    .line 421
    .line 422
    iget-boolean v7, v3, Liz5;->g:Z

    .line 423
    .line 424
    goto :goto_c

    .line 425
    :cond_14
    iget v7, v10, Llz5;->c:I

    .line 426
    .line 427
    if-ltz v7, :cond_1b

    .line 428
    .line 429
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->G:Lpy5;

    .line 430
    .line 431
    invoke-virtual {v12}, Lpy5;->a()I

    .line 432
    .line 433
    .line 434
    move-result v12

    .line 435
    if-ge v7, v12, :cond_1b

    .line 436
    .line 437
    iget-boolean v7, v3, Liz5;->g:Z

    .line 438
    .line 439
    if-nez v7, :cond_16

    .line 440
    .line 441
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->G:Lpy5;

    .line 442
    .line 443
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    iget v7, v10, Llz5;->f:I

    .line 447
    .line 448
    if-eqz v7, :cond_16

    .line 449
    .line 450
    :cond_15
    move v7, v8

    .line 451
    goto :goto_c

    .line 452
    :cond_16
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->G:Lpy5;

    .line 453
    .line 454
    iget-boolean v12, v7, Lpy5;->b:Z

    .line 455
    .line 456
    if-eqz v12, :cond_17

    .line 457
    .line 458
    iget-wide v12, v10, Llz5;->e:J

    .line 459
    .line 460
    iget v14, v10, Llz5;->c:I

    .line 461
    .line 462
    invoke-virtual {v7, v14}, Lpy5;->b(I)J

    .line 463
    .line 464
    .line 465
    move-result-wide v14

    .line 466
    cmp-long v7, v12, v14

    .line 467
    .line 468
    if-nez v7, :cond_15

    .line 469
    .line 470
    :cond_17
    move/from16 v7, v16

    .line 471
    .line 472
    :goto_c
    if-nez v7, :cond_1a

    .line 473
    .line 474
    const/4 v7, 0x4

    .line 475
    invoke-virtual {v10, v7}, Llz5;->a(I)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v10}, Llz5;->i()Z

    .line 479
    .line 480
    .line 481
    move-result v7

    .line 482
    if-eqz v7, :cond_18

    .line 483
    .line 484
    iget-object v7, v10, Llz5;->a:Landroid/view/View;

    .line 485
    .line 486
    invoke-virtual {v2, v7, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 487
    .line 488
    .line 489
    iget-object v7, v10, Llz5;->n:Ldz5;

    .line 490
    .line 491
    invoke-virtual {v7, v10}, Ldz5;->k(Llz5;)V

    .line 492
    .line 493
    .line 494
    goto :goto_d

    .line 495
    :cond_18
    invoke-virtual {v10}, Llz5;->p()Z

    .line 496
    .line 497
    .line 498
    move-result v7

    .line 499
    if-eqz v7, :cond_19

    .line 500
    .line 501
    iget v7, v10, Llz5;->j:I

    .line 502
    .line 503
    and-int/lit8 v7, v7, -0x21

    .line 504
    .line 505
    iput v7, v10, Llz5;->j:I

    .line 506
    .line 507
    :cond_19
    :goto_d
    invoke-virtual {v0, v10}, Ldz5;->h(Llz5;)V

    .line 508
    .line 509
    .line 510
    move-object v10, v6

    .line 511
    goto :goto_e

    .line 512
    :cond_1a
    move/from16 v4, v16

    .line 513
    .line 514
    goto :goto_e

    .line 515
    :cond_1b
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 516
    .line 517
    new-instance v1, Ljava/lang/StringBuilder;

    .line 518
    .line 519
    const-string v3, "Inconsistency detected. Invalid view holder adapter position"

    .line 520
    .line 521
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    throw v0

    .line 542
    :cond_1c
    const/16 v16, 0x1

    .line 543
    .line 544
    :cond_1d
    :goto_e
    const-wide/16 v17, 0x0

    .line 545
    .line 546
    const-wide v19, 0x7fffffffffffffffL

    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    if-nez v10, :cond_31

    .line 552
    .line 553
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->z:Lo9;

    .line 554
    .line 555
    invoke-virtual {v7, v1, v8}, Lo9;->v(II)I

    .line 556
    .line 557
    .line 558
    move-result v7

    .line 559
    if-ltz v7, :cond_30

    .line 560
    .line 561
    const-wide/16 v21, 0x3

    .line 562
    .line 563
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->G:Lpy5;

    .line 564
    .line 565
    invoke-virtual {v12}, Lpy5;->a()I

    .line 566
    .line 567
    .line 568
    move-result v12

    .line 569
    if-ge v7, v12, :cond_30

    .line 570
    .line 571
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->G:Lpy5;

    .line 572
    .line 573
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->G:Lpy5;

    .line 577
    .line 578
    iget-boolean v13, v12, Lpy5;->b:Z

    .line 579
    .line 580
    if-eqz v13, :cond_25

    .line 581
    .line 582
    invoke-virtual {v12, v7}, Lpy5;->b(I)J

    .line 583
    .line 584
    .line 585
    move-result-wide v12

    .line 586
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 587
    .line 588
    .line 589
    move-result v10

    .line 590
    add-int/lit8 v10, v10, -0x1

    .line 591
    .line 592
    :goto_f
    if-ltz v10, :cond_21

    .line 593
    .line 594
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v23

    .line 598
    const-wide/16 v24, 0x4

    .line 599
    .line 600
    move-object/from16 v14, v23

    .line 601
    .line 602
    check-cast v14, Llz5;

    .line 603
    .line 604
    move/from16 v23, v7

    .line 605
    .line 606
    iget-wide v6, v14, Llz5;->e:J

    .line 607
    .line 608
    iget-object v15, v14, Llz5;->a:Landroid/view/View;

    .line 609
    .line 610
    cmp-long v6, v6, v12

    .line 611
    .line 612
    if-nez v6, :cond_20

    .line 613
    .line 614
    invoke-virtual {v14}, Llz5;->p()Z

    .line 615
    .line 616
    .line 617
    move-result v6

    .line 618
    if-nez v6, :cond_20

    .line 619
    .line 620
    iget v6, v14, Llz5;->f:I

    .line 621
    .line 622
    if-nez v6, :cond_1f

    .line 623
    .line 624
    invoke-virtual {v14, v5}, Llz5;->a(I)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v14}, Llz5;->h()Z

    .line 628
    .line 629
    .line 630
    move-result v5

    .line 631
    if-eqz v5, :cond_1e

    .line 632
    .line 633
    iget-boolean v5, v3, Liz5;->g:Z

    .line 634
    .line 635
    if-nez v5, :cond_1e

    .line 636
    .line 637
    iget v5, v14, Llz5;->j:I

    .line 638
    .line 639
    and-int/lit8 v5, v5, -0xf

    .line 640
    .line 641
    or-int/lit8 v5, v5, 0x2

    .line 642
    .line 643
    iput v5, v14, Llz5;->j:I

    .line 644
    .line 645
    :cond_1e
    move-object v10, v14

    .line 646
    goto :goto_11

    .line 647
    :cond_1f
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v2, v15, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 651
    .line 652
    .line 653
    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llz5;

    .line 654
    .line 655
    .line 656
    move-result-object v6

    .line 657
    const/4 v15, 0x0

    .line 658
    iput-object v15, v6, Llz5;->n:Ldz5;

    .line 659
    .line 660
    iput-boolean v8, v6, Llz5;->o:Z

    .line 661
    .line 662
    iget v7, v6, Llz5;->j:I

    .line 663
    .line 664
    and-int/lit8 v7, v7, -0x21

    .line 665
    .line 666
    iput v7, v6, Llz5;->j:I

    .line 667
    .line 668
    invoke-virtual {v0, v6}, Ldz5;->h(Llz5;)V

    .line 669
    .line 670
    .line 671
    :cond_20
    add-int/lit8 v10, v10, -0x1

    .line 672
    .line 673
    move/from16 v7, v23

    .line 674
    .line 675
    const/4 v6, 0x0

    .line 676
    goto :goto_f

    .line 677
    :cond_21
    move/from16 v23, v7

    .line 678
    .line 679
    const-wide/16 v24, 0x4

    .line 680
    .line 681
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 682
    .line 683
    .line 684
    move-result v5

    .line 685
    add-int/lit8 v5, v5, -0x1

    .line 686
    .line 687
    :goto_10
    if-ltz v5, :cond_23

    .line 688
    .line 689
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v6

    .line 693
    check-cast v6, Llz5;

    .line 694
    .line 695
    iget-wide v9, v6, Llz5;->e:J

    .line 696
    .line 697
    cmp-long v7, v9, v12

    .line 698
    .line 699
    if-nez v7, :cond_24

    .line 700
    .line 701
    invoke-virtual {v6}, Llz5;->d()Z

    .line 702
    .line 703
    .line 704
    move-result v7

    .line 705
    if-nez v7, :cond_24

    .line 706
    .line 707
    iget v7, v6, Llz5;->f:I

    .line 708
    .line 709
    if-nez v7, :cond_22

    .line 710
    .line 711
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-object v10, v6

    .line 715
    goto :goto_11

    .line 716
    :cond_22
    invoke-virtual {v0, v5}, Ldz5;->f(I)V

    .line 717
    .line 718
    .line 719
    :cond_23
    const/4 v10, 0x0

    .line 720
    goto :goto_11

    .line 721
    :cond_24
    add-int/lit8 v5, v5, -0x1

    .line 722
    .line 723
    goto :goto_10

    .line 724
    :goto_11
    if-eqz v10, :cond_26

    .line 725
    .line 726
    move/from16 v5, v23

    .line 727
    .line 728
    iput v5, v10, Llz5;->c:I

    .line 729
    .line 730
    move/from16 v4, v16

    .line 731
    .line 732
    goto :goto_12

    .line 733
    :cond_25
    const-wide/16 v24, 0x4

    .line 734
    .line 735
    :cond_26
    :goto_12
    if-nez v10, :cond_2a

    .line 736
    .line 737
    invoke-virtual {v0}, Ldz5;->c()Lcz5;

    .line 738
    .line 739
    .line 740
    move-result-object v5

    .line 741
    iget-object v5, v5, Lcz5;->a:Landroid/util/SparseArray;

    .line 742
    .line 743
    invoke-virtual {v5, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v5

    .line 747
    check-cast v5, Lbz5;

    .line 748
    .line 749
    if-eqz v5, :cond_28

    .line 750
    .line 751
    iget-object v5, v5, Lbz5;->a:Ljava/util/ArrayList;

    .line 752
    .line 753
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 754
    .line 755
    .line 756
    move-result v6

    .line 757
    if-nez v6, :cond_28

    .line 758
    .line 759
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 760
    .line 761
    .line 762
    move-result v6

    .line 763
    add-int/lit8 v6, v6, -0x1

    .line 764
    .line 765
    :goto_13
    if-ltz v6, :cond_28

    .line 766
    .line 767
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v7

    .line 771
    check-cast v7, Llz5;

    .line 772
    .line 773
    invoke-virtual {v7}, Llz5;->d()Z

    .line 774
    .line 775
    .line 776
    move-result v7

    .line 777
    if-nez v7, :cond_27

    .line 778
    .line 779
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v5

    .line 783
    check-cast v5, Llz5;

    .line 784
    .line 785
    goto :goto_14

    .line 786
    :cond_27
    add-int/lit8 v6, v6, -0x1

    .line 787
    .line 788
    goto :goto_13

    .line 789
    :cond_28
    const/4 v5, 0x0

    .line 790
    :goto_14
    if-eqz v5, :cond_29

    .line 791
    .line 792
    invoke-virtual {v5}, Llz5;->m()V

    .line 793
    .line 794
    .line 795
    sget-object v6, Landroidx/recyclerview/widget/RecyclerView;->S0:[I

    .line 796
    .line 797
    :cond_29
    move-object v10, v5

    .line 798
    :cond_2a
    if-nez v10, :cond_32

    .line 799
    .line 800
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 801
    .line 802
    .line 803
    move-result-wide v5

    .line 804
    cmp-long v7, p1, v19

    .line 805
    .line 806
    if-eqz v7, :cond_2c

    .line 807
    .line 808
    iget-object v7, v0, Ldz5;->g:Lcz5;

    .line 809
    .line 810
    invoke-virtual {v7, v8}, Lcz5;->a(I)Lbz5;

    .line 811
    .line 812
    .line 813
    move-result-object v7

    .line 814
    iget-wide v9, v7, Lbz5;->c:J

    .line 815
    .line 816
    cmp-long v7, v9, v17

    .line 817
    .line 818
    if-eqz v7, :cond_2c

    .line 819
    .line 820
    add-long/2addr v9, v5

    .line 821
    cmp-long v7, v9, p1

    .line 822
    .line 823
    if-gez v7, :cond_2b

    .line 824
    .line 825
    goto :goto_15

    .line 826
    :cond_2b
    const/4 v15, 0x0

    .line 827
    return-object v15

    .line 828
    :cond_2c
    :goto_15
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->G:Lpy5;

    .line 829
    .line 830
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 831
    .line 832
    .line 833
    :try_start_0
    const-string v9, "RV CreateView"

    .line 834
    .line 835
    sget v10, Luk7;->a:I

    .line 836
    .line 837
    invoke-static {v9}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v7, v2}, Lpy5;->d(Landroid/view/ViewGroup;)Llz5;

    .line 841
    .line 842
    .line 843
    move-result-object v10

    .line 844
    iget-object v7, v10, Llz5;->a:Landroid/view/View;

    .line 845
    .line 846
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 847
    .line 848
    .line 849
    move-result-object v9

    .line 850
    if-nez v9, :cond_2f

    .line 851
    .line 852
    iput v8, v10, Llz5;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 853
    .line 854
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 855
    .line 856
    .line 857
    sget-object v9, Landroidx/recyclerview/widget/RecyclerView;->S0:[I

    .line 858
    .line 859
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 860
    .line 861
    .line 862
    move-result-object v7

    .line 863
    if-eqz v7, :cond_2d

    .line 864
    .line 865
    new-instance v9, Ljava/lang/ref/WeakReference;

    .line 866
    .line 867
    invoke-direct {v9, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 868
    .line 869
    .line 870
    iput-object v9, v10, Llz5;->b:Ljava/lang/ref/WeakReference;

    .line 871
    .line 872
    :cond_2d
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 873
    .line 874
    .line 875
    move-result-wide v11

    .line 876
    iget-object v7, v0, Ldz5;->g:Lcz5;

    .line 877
    .line 878
    sub-long/2addr v11, v5

    .line 879
    invoke-virtual {v7, v8}, Lcz5;->a(I)Lbz5;

    .line 880
    .line 881
    .line 882
    move-result-object v5

    .line 883
    iget-wide v6, v5, Lbz5;->c:J

    .line 884
    .line 885
    cmp-long v9, v6, v17

    .line 886
    .line 887
    if-nez v9, :cond_2e

    .line 888
    .line 889
    goto :goto_16

    .line 890
    :cond_2e
    div-long v6, v6, v24

    .line 891
    .line 892
    mul-long v6, v6, v21

    .line 893
    .line 894
    div-long v11, v11, v24

    .line 895
    .line 896
    add-long/2addr v11, v6

    .line 897
    :goto_16
    iput-wide v11, v5, Lbz5;->c:J

    .line 898
    .line 899
    goto :goto_17

    .line 900
    :cond_2f
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 901
    .line 902
    const-string v1, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    .line 903
    .line 904
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 908
    :catchall_0
    move-exception v0

    .line 909
    sget v1, Luk7;->a:I

    .line 910
    .line 911
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 912
    .line 913
    .line 914
    throw v0

    .line 915
    :cond_30
    move v5, v7

    .line 916
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 917
    .line 918
    const-string v4, "(offset:"

    .line 919
    .line 920
    const-string v6, ").state:"

    .line 921
    .line 922
    const-string v7, "Inconsistency detected. Invalid item position "

    .line 923
    .line 924
    invoke-static {v7, v1, v4, v5, v6}, Lpb4;->p(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 925
    .line 926
    .line 927
    move-result-object v1

    .line 928
    invoke-virtual {v3}, Liz5;->b()I

    .line 929
    .line 930
    .line 931
    move-result v3

    .line 932
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 933
    .line 934
    .line 935
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v2

    .line 939
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v1

    .line 946
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    throw v0

    .line 950
    :cond_31
    const-wide/16 v21, 0x3

    .line 951
    .line 952
    const-wide/16 v24, 0x4

    .line 953
    .line 954
    :cond_32
    :goto_17
    iget-object v5, v10, Llz5;->a:Landroid/view/View;

    .line 955
    .line 956
    if-eqz v4, :cond_33

    .line 957
    .line 958
    iget-boolean v6, v3, Liz5;->g:Z

    .line 959
    .line 960
    if-nez v6, :cond_33

    .line 961
    .line 962
    iget v6, v10, Llz5;->j:I

    .line 963
    .line 964
    and-int/lit16 v7, v6, 0x2000

    .line 965
    .line 966
    if-eqz v7, :cond_33

    .line 967
    .line 968
    and-int/lit16 v6, v6, -0x2001

    .line 969
    .line 970
    iput v6, v10, Llz5;->j:I

    .line 971
    .line 972
    iget-boolean v6, v3, Liz5;->j:Z

    .line 973
    .line 974
    if-eqz v6, :cond_33

    .line 975
    .line 976
    invoke-static {v10}, Lty5;->b(Llz5;)V

    .line 977
    .line 978
    .line 979
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->h0:Lty5;

    .line 980
    .line 981
    invoke-virtual {v10}, Llz5;->c()Ljava/util/List;

    .line 982
    .line 983
    .line 984
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 985
    .line 986
    .line 987
    new-instance v6, Ldv5;

    .line 988
    .line 989
    const/16 v7, 0x8

    .line 990
    .line 991
    invoke-direct {v6, v7, v8}, Ldv5;-><init>(IB)V

    .line 992
    .line 993
    .line 994
    invoke-virtual {v6, v10}, Ldv5;->a(Llz5;)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v2, v10, v6}, Landroidx/recyclerview/widget/RecyclerView;->T(Llz5;Ldv5;)V

    .line 998
    .line 999
    .line 1000
    :cond_33
    iget-boolean v6, v3, Liz5;->g:Z

    .line 1001
    .line 1002
    if-eqz v6, :cond_34

    .line 1003
    .line 1004
    invoke-virtual {v10}, Llz5;->e()Z

    .line 1005
    .line 1006
    .line 1007
    move-result v6

    .line 1008
    if-eqz v6, :cond_34

    .line 1009
    .line 1010
    iput v1, v10, Llz5;->g:I

    .line 1011
    .line 1012
    goto :goto_18

    .line 1013
    :cond_34
    invoke-virtual {v10}, Llz5;->e()Z

    .line 1014
    .line 1015
    .line 1016
    move-result v6

    .line 1017
    if-eqz v6, :cond_37

    .line 1018
    .line 1019
    iget v6, v10, Llz5;->j:I

    .line 1020
    .line 1021
    and-int/lit8 v6, v6, 0x2

    .line 1022
    .line 1023
    if-eqz v6, :cond_35

    .line 1024
    .line 1025
    goto :goto_19

    .line 1026
    :cond_35
    invoke-virtual {v10}, Llz5;->f()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v6

    .line 1030
    if-eqz v6, :cond_36

    .line 1031
    .line 1032
    goto :goto_19

    .line 1033
    :cond_36
    :goto_18
    move v0, v8

    .line 1034
    move/from16 v7, v16

    .line 1035
    .line 1036
    goto/16 :goto_1e

    .line 1037
    .line 1038
    :cond_37
    :goto_19
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->z:Lo9;

    .line 1039
    .line 1040
    invoke-virtual {v6, v1, v8}, Lo9;->v(II)I

    .line 1041
    .line 1042
    .line 1043
    move-result v6

    .line 1044
    const/4 v15, 0x0

    .line 1045
    iput-object v15, v10, Llz5;->s:Lpy5;

    .line 1046
    .line 1047
    iput-object v2, v10, Llz5;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 1048
    .line 1049
    iget v7, v10, Llz5;->f:I

    .line 1050
    .line 1051
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1052
    .line 1053
    .line 1054
    move-result-wide v11

    .line 1055
    cmp-long v9, p1, v19

    .line 1056
    .line 1057
    if-eqz v9, :cond_38

    .line 1058
    .line 1059
    iget-object v9, v0, Ldz5;->g:Lcz5;

    .line 1060
    .line 1061
    invoke-virtual {v9, v7}, Lcz5;->a(I)Lbz5;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v7

    .line 1065
    iget-wide v13, v7, Lbz5;->d:J

    .line 1066
    .line 1067
    cmp-long v7, v13, v17

    .line 1068
    .line 1069
    if-eqz v7, :cond_38

    .line 1070
    .line 1071
    add-long/2addr v13, v11

    .line 1072
    cmp-long v7, v13, p1

    .line 1073
    .line 1074
    if-gez v7, :cond_36

    .line 1075
    .line 1076
    :cond_38
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->G:Lpy5;

    .line 1077
    .line 1078
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1079
    .line 1080
    .line 1081
    iget-object v9, v10, Llz5;->s:Lpy5;

    .line 1082
    .line 1083
    if-nez v9, :cond_39

    .line 1084
    .line 1085
    move/from16 v9, v16

    .line 1086
    .line 1087
    goto :goto_1a

    .line 1088
    :cond_39
    move v9, v8

    .line 1089
    :goto_1a
    if-eqz v9, :cond_3b

    .line 1090
    .line 1091
    iput v6, v10, Llz5;->c:I

    .line 1092
    .line 1093
    iget-boolean v13, v7, Lpy5;->b:Z

    .line 1094
    .line 1095
    if-eqz v13, :cond_3a

    .line 1096
    .line 1097
    invoke-virtual {v7, v6}, Lpy5;->b(I)J

    .line 1098
    .line 1099
    .line 1100
    move-result-wide v13

    .line 1101
    iput-wide v13, v10, Llz5;->e:J

    .line 1102
    .line 1103
    :cond_3a
    iget v13, v10, Llz5;->j:I

    .line 1104
    .line 1105
    and-int/lit16 v13, v13, -0x208

    .line 1106
    .line 1107
    or-int/lit8 v13, v13, 0x1

    .line 1108
    .line 1109
    iput v13, v10, Llz5;->j:I

    .line 1110
    .line 1111
    sget v13, Luk7;->a:I

    .line 1112
    .line 1113
    const-string v13, "RV OnBindView"

    .line 1114
    .line 1115
    invoke-static {v13}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1116
    .line 1117
    .line 1118
    :cond_3b
    iput-object v7, v10, Llz5;->s:Lpy5;

    .line 1119
    .line 1120
    invoke-virtual {v10}, Llz5;->c()Ljava/util/List;

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v7, v10, v6}, Lpy5;->c(Llz5;I)V

    .line 1124
    .line 1125
    .line 1126
    if-eqz v9, :cond_3e

    .line 1127
    .line 1128
    iget-object v6, v10, Llz5;->k:Ljava/util/ArrayList;

    .line 1129
    .line 1130
    if-eqz v6, :cond_3c

    .line 1131
    .line 1132
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 1133
    .line 1134
    .line 1135
    :cond_3c
    iget v6, v10, Llz5;->j:I

    .line 1136
    .line 1137
    and-int/lit16 v6, v6, -0x401

    .line 1138
    .line 1139
    iput v6, v10, Llz5;->j:I

    .line 1140
    .line 1141
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v6

    .line 1145
    instance-of v7, v6, Lyy5;

    .line 1146
    .line 1147
    if-eqz v7, :cond_3d

    .line 1148
    .line 1149
    check-cast v6, Lyy5;

    .line 1150
    .line 1151
    move/from16 v7, v16

    .line 1152
    .line 1153
    iput-boolean v7, v6, Lyy5;->c:Z

    .line 1154
    .line 1155
    :cond_3d
    sget v6, Luk7;->a:I

    .line 1156
    .line 1157
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1158
    .line 1159
    .line 1160
    :cond_3e
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1161
    .line 1162
    .line 1163
    move-result-wide v6

    .line 1164
    iget-object v0, v0, Ldz5;->g:Lcz5;

    .line 1165
    .line 1166
    iget v9, v10, Llz5;->f:I

    .line 1167
    .line 1168
    sub-long/2addr v6, v11

    .line 1169
    invoke-virtual {v0, v9}, Lcz5;->a(I)Lbz5;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    iget-wide v11, v0, Lbz5;->d:J

    .line 1174
    .line 1175
    cmp-long v9, v11, v17

    .line 1176
    .line 1177
    if-nez v9, :cond_3f

    .line 1178
    .line 1179
    goto :goto_1b

    .line 1180
    :cond_3f
    div-long v11, v11, v24

    .line 1181
    .line 1182
    mul-long v11, v11, v21

    .line 1183
    .line 1184
    div-long v6, v6, v24

    .line 1185
    .line 1186
    add-long/2addr v6, v11

    .line 1187
    :goto_1b
    iput-wide v6, v0, Lbz5;->d:J

    .line 1188
    .line 1189
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/view/accessibility/AccessibilityManager;

    .line 1190
    .line 1191
    if-eqz v0, :cond_45

    .line 1192
    .line 1193
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1194
    .line 1195
    .line 1196
    move-result v0

    .line 1197
    if-eqz v0, :cond_45

    .line 1198
    .line 1199
    sget-object v0, Le58;->a:Ljava/util/WeakHashMap;

    .line 1200
    .line 1201
    invoke-virtual {v5}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1202
    .line 1203
    .line 1204
    move-result v0

    .line 1205
    const/4 v7, 0x1

    .line 1206
    if-nez v0, :cond_40

    .line 1207
    .line 1208
    invoke-virtual {v5, v7}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1209
    .line 1210
    .line 1211
    :cond_40
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->G0:Lnz5;

    .line 1212
    .line 1213
    if-nez v0, :cond_41

    .line 1214
    .line 1215
    goto :goto_1d

    .line 1216
    :cond_41
    iget-object v0, v0, Lnz5;->A:Lmz5;

    .line 1217
    .line 1218
    if-eqz v0, :cond_44

    .line 1219
    .line 1220
    invoke-static {v5}, Le58;->d(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v6

    .line 1224
    if-nez v6, :cond_42

    .line 1225
    .line 1226
    move-object v6, v15

    .line 1227
    goto :goto_1c

    .line 1228
    :cond_42
    instance-of v9, v6, Lj4;

    .line 1229
    .line 1230
    if-eqz v9, :cond_43

    .line 1231
    .line 1232
    check-cast v6, Lj4;

    .line 1233
    .line 1234
    iget-object v6, v6, Lj4;->a:Lk4;

    .line 1235
    .line 1236
    goto :goto_1c

    .line 1237
    :cond_43
    new-instance v9, Lk4;

    .line 1238
    .line 1239
    invoke-direct {v9, v6}, Lk4;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 1240
    .line 1241
    .line 1242
    move-object v6, v9

    .line 1243
    :goto_1c
    if-eqz v6, :cond_44

    .line 1244
    .line 1245
    if-eq v6, v0, :cond_44

    .line 1246
    .line 1247
    iget-object v9, v0, Lmz5;->A:Ljava/util/WeakHashMap;

    .line 1248
    .line 1249
    invoke-virtual {v9, v5, v6}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    :cond_44
    invoke-static {v5, v0}, Le58;->m(Landroid/view/View;Lk4;)V

    .line 1253
    .line 1254
    .line 1255
    goto :goto_1d

    .line 1256
    :cond_45
    const/4 v7, 0x1

    .line 1257
    :goto_1d
    iget-boolean v0, v3, Liz5;->g:Z

    .line 1258
    .line 1259
    if-eqz v0, :cond_46

    .line 1260
    .line 1261
    iput v1, v10, Llz5;->g:I

    .line 1262
    .line 1263
    :cond_46
    move v0, v7

    .line 1264
    :goto_1e
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v1

    .line 1268
    if-nez v1, :cond_47

    .line 1269
    .line 1270
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v1

    .line 1274
    check-cast v1, Lyy5;

    .line 1275
    .line 1276
    invoke-virtual {v5, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1277
    .line 1278
    .line 1279
    goto :goto_1f

    .line 1280
    :cond_47
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1281
    .line 1282
    .line 1283
    move-result v3

    .line 1284
    if-nez v3, :cond_48

    .line 1285
    .line 1286
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v1

    .line 1290
    check-cast v1, Lyy5;

    .line 1291
    .line 1292
    invoke-virtual {v5, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1293
    .line 1294
    .line 1295
    goto :goto_1f

    .line 1296
    :cond_48
    check-cast v1, Lyy5;

    .line 1297
    .line 1298
    :goto_1f
    iput-object v10, v1, Lyy5;->a:Llz5;

    .line 1299
    .line 1300
    if-eqz v4, :cond_49

    .line 1301
    .line 1302
    if-eqz v0, :cond_49

    .line 1303
    .line 1304
    goto :goto_20

    .line 1305
    :cond_49
    move v7, v8

    .line 1306
    :goto_20
    iput-boolean v7, v1, Lyy5;->d:Z

    .line 1307
    .line 1308
    return-object v10

    .line 1309
    :cond_4a
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 1310
    .line 1311
    const-string v4, "("

    .line 1312
    .line 1313
    const-string v5, "). Item count:"

    .line 1314
    .line 1315
    const-string v6, "Invalid item position "

    .line 1316
    .line 1317
    invoke-static {v6, v1, v4, v1, v5}, Lpb4;->p(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v1

    .line 1321
    invoke-virtual {v3}, Liz5;->b()I

    .line 1322
    .line 1323
    .line 1324
    move-result v3

    .line 1325
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v2

    .line 1332
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v1

    .line 1339
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1340
    .line 1341
    .line 1342
    throw v0
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
.end method

.method public final k(Llz5;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Llz5;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldz5;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p0, p0, Ldz5;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    iput-object p0, p1, Llz5;->n:Ldz5;

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    iput-boolean p0, p1, Llz5;->o:Z

    .line 21
    .line 22
    iget p0, p1, Llz5;->j:I

    .line 23
    .line 24
    and-int/lit8 p0, p0, -0x21

    .line 25
    .line 26
    iput p0, p1, Llz5;->j:I

    .line 27
    .line 28
    return-void
    .line 29
.end method

.method public final l()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldz5;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->H:Lxy5;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lxy5;->j:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Ldz5;->e:I

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    iput v1, p0, Ldz5;->f:I

    .line 15
    .line 16
    iget-object v0, p0, Ldz5;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    :goto_1
    if-ltz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget v3, p0, Ldz5;->f:I

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Ldz5;->f(I)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method
