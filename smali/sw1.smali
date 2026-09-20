.class public final Lsw1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfi2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lfi2;

.field public final synthetic y:Lh06;


# direct methods
.method public constructor <init>(Lfi2;Lh06;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lsw1;->w:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsw1;->x:Lfi2;

    iput-object p2, p0, Lsw1;->y:Lh06;

    return-void
.end method

.method public constructor <init>(Ltw1;Lh06;Lfi2;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lsw1;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lsw1;->y:Lh06;

    .line 8
    .line 9
    iput-object p3, p0, Lsw1;->x:Lfi2;

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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
.end method


# virtual methods
.method public final k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lsw1;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Lsw1;->y:Lh06;

    .line 4
    .line 5
    sget-object v2, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    iget-object v3, p0, Lsw1;->x:Lfi2;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v6, Lp81;->w:Lp81;

    .line 13
    .line 14
    const/high16 v7, -0x80000000

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    instance-of v0, p2, Lti2;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move-object v0, p2

    .line 25
    check-cast v0, Lti2;

    .line 26
    .line 27
    iget v9, v0, Lti2;->B:I

    .line 28
    .line 29
    and-int v10, v9, v7

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    sub-int/2addr v9, v7

    .line 34
    iput v9, v0, Lti2;->B:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Lti2;

    .line 38
    .line 39
    invoke-direct {v0, p0, p2}, Lti2;-><init>(Lsw1;Lf61;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object p0, v0, Lti2;->z:Ljava/lang/Object;

    .line 43
    .line 44
    iget p2, v0, Lti2;->B:I

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    if-ne p2, v8, :cond_1

    .line 49
    .line 50
    :try_start_0
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto :goto_2

    .line 56
    :cond_1
    invoke-static {v5}, Lh;->s(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    move-object v2, v4

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :try_start_1
    iput v8, v0, Lti2;->B:I

    .line 65
    .line 66
    invoke-interface {v3, p1, v0}, Lfi2;->k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    if-ne p0, v6, :cond_3

    .line 71
    .line 72
    move-object v2, v6

    .line 73
    :cond_3
    :goto_1
    return-object v2

    .line 74
    :goto_2
    iput-object p0, v1, Lh06;->w:Ljava/lang/Object;

    .line 75
    .line 76
    throw p0

    .line 77
    :pswitch_0
    instance-of v0, p2, Lrw1;

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    move-object v0, p2

    .line 82
    check-cast v0, Lrw1;

    .line 83
    .line 84
    iget v9, v0, Lrw1;->B:I

    .line 85
    .line 86
    and-int v10, v9, v7

    .line 87
    .line 88
    if-eqz v10, :cond_4

    .line 89
    .line 90
    sub-int/2addr v9, v7

    .line 91
    iput v9, v0, Lrw1;->B:I

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    new-instance v0, Lrw1;

    .line 95
    .line 96
    invoke-direct {v0, p0, p2}, Lrw1;-><init>(Lsw1;Lf61;)V

    .line 97
    .line 98
    .line 99
    :goto_3
    iget-object p0, v0, Lrw1;->z:Ljava/lang/Object;

    .line 100
    .line 101
    iget p2, v0, Lrw1;->B:I

    .line 102
    .line 103
    if-eqz p2, :cond_6

    .line 104
    .line 105
    if-ne p2, v8, :cond_5

    .line 106
    .line 107
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_5
    invoke-static {v5}, Lh;->s(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    move-object v2, v4

    .line 115
    goto :goto_4

    .line 116
    :cond_6
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object p0, v1, Lh06;->w:Ljava/lang/Object;

    .line 120
    .line 121
    sget-object p2, Lo15;->a:Lpy2;

    .line 122
    .line 123
    if-eq p0, p2, :cond_7

    .line 124
    .line 125
    invoke-static {p0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-nez p0, :cond_8

    .line 130
    .line 131
    :cond_7
    iput-object p1, v1, Lh06;->w:Ljava/lang/Object;

    .line 132
    .line 133
    iput v8, v0, Lrw1;->B:I

    .line 134
    .line 135
    invoke-interface {v3, p1, v0}, Lfi2;->k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-ne p0, v6, :cond_8

    .line 140
    .line 141
    move-object v2, v6

    .line 142
    :cond_8
    :goto_4
    return-object v2

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
