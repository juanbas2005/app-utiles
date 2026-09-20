.class public final Lq89;
.super Lbq2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lg94;


# instance fields
.field public t0:Landroid/widget/ListView;

.field public u0:Ll79;

.field public v0:Ls47;

.field public w0:Ljava/lang/String;

.field public x0:Lk68;

.field public y0:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbq2;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 1
    iget-object p0, p0, Lq89;->v0:Ls47;

    .line 2
    .line 3
    iget-object v0, p0, Ls47;->a:Landroid/content/res/Resources;

    .line 4
    .line 5
    iget-object p0, p0, Ls47;->b:Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "license_menu_fragment"

    .line 8
    .line 9
    const-string v2, "layout"

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, p0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, p0, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
    .line 21
    .line 22
    .line 23
    .line 24
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
.end method

.method public final B()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lbq2;->a0:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lbq2;->l()Leq2;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_2

    .line 9
    .line 10
    invoke-static {p0}, Lhv2;->N0(Lt54;)Lhv2;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, Lhv2;->x:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Li94;

    .line 17
    .line 18
    iget-boolean v1, p0, Li94;->c:Z

    .line 19
    .line 20
    iget-object p0, p0, Li94;->b:Lcz6;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-ne v1, v2, :cond_0

    .line 33
    .line 34
    const v1, 0xd431

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lcz6;->c(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lh94;

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {v2}, Lh94;->j()V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Lcz6;->x:[I

    .line 49
    .line 50
    iget v3, p0, Lcz6;->z:I

    .line 51
    .line 52
    invoke-static {v3, v1, v2}, Lie1;->q(II[I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-ltz v1, :cond_2

    .line 57
    .line 58
    iget-object v2, p0, Lcz6;->y:[Ljava/lang/Object;

    .line 59
    .line 60
    aget-object v3, v2, v1

    .line 61
    .line 62
    sget-object v4, Lrg3;->j:Ljava/lang/Object;

    .line 63
    .line 64
    if-eq v3, v4, :cond_2

    .line 65
    .line 66
    aput-object v4, v2, v1

    .line 67
    .line 68
    iput-boolean v0, p0, Lcz6;->w:Z

    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    const-string p0, "destroyLoader must be called on the main thread"

    .line 72
    .line 73
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_1
    const-string p0, "Called while creating a loader"

    .line 78
    .line 79
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    return-void
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final I(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbq2;->l()Leq2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lhv2;->N0(Lt54;)Lhv2;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const v2, 0xd431

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2, p0}, Lhv2;->Q0(ILg94;)Lai8;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lq89;->v0:Ls47;

    .line 19
    .line 20
    iget-object v2, v1, Ls47;->a:Landroid/content/res/Resources;

    .line 21
    .line 22
    iget-object v1, v1, Ls47;->b:Ljava/lang/String;

    .line 23
    .line 24
    const-string v3, "license_list"

    .line 25
    .line 26
    const-string v4, "id"

    .line 27
    .line 28
    invoke-virtual {v2, v3, v4, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Landroid/widget/ListView;

    .line 37
    .line 38
    iput-object p1, p0, Lq89;->t0:Landroid/widget/ListView;

    .line 39
    .line 40
    new-instance p1, Ll79;

    .line 41
    .line 42
    invoke-direct {p1, p0, v0}, Ll79;-><init>(Lq89;Leq2;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lq89;->u0:Ll79;

    .line 46
    .line 47
    iget-object v0, p0, Lq89;->t0:Landroid/widget/ListView;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lq89;->t0:Landroid/widget/ListView;

    .line 53
    .line 54
    new-instance v0, Lqp;

    .line 55
    .line 56
    const/4 v1, 0x2

    .line 57
    invoke-direct {v0, v1, p0}, Lqp;-><init>(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 61
    .line 62
    .line 63
    return-void
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

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq89;->u0:Ll79;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lq89;->u0:Ll79;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final bridge synthetic f(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, Lq89;->u0:Ll79;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lq89;->u0:Ll79;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/ArrayAdapter;->addAll(Ljava/util/Collection;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lq89;->u0:Ll79;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public final i()Lai8;
    .locals 2

    .line 1
    new-instance v0, Lai8;

    .line 2
    .line 3
    iget-object v1, p0, Lq89;->y0:Landroid/content/Context;

    .line 4
    .line 5
    iget-object p0, p0, Lq89;->x0:Lk68;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lai8;-><init>(Landroid/content/Context;Lk68;)V

    .line 8
    .line 9
    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final y(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbq2;->y(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq89;->y0:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {p1}, Lk68;->m(Landroid/content/Context;)Lk68;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lq89;->x0:Lk68;

    .line 11
    .line 12
    return-void
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

.method public final z(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lbq2;->z(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lbq2;->B:Landroid/os/Bundle;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string v0, "license_activity_package_name"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lq89;->w0:Ljava/lang/String;

    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, Lq89;->w0:Ljava/lang/String;

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Lq89;->y0:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lq89;->w0:Ljava/lang/String;

    .line 29
    .line 30
    :cond_1
    iget-object p1, p0, Lq89;->y0:Landroid/content/Context;

    .line 31
    .line 32
    iget-object v0, p0, Lq89;->w0:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p1, v0}, Lk68;->q(Landroid/content/Context;Ljava/lang/String;)Ls47;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lq89;->v0:Ls47;

    .line 39
    .line 40
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
