.class public final Lez2;
.super Ll66;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public synthetic D:Ljava/lang/Object;

.field public final synthetic E:Lfz2;

.field public y:Ljava/util/Iterator;

.field public z:[I


# direct methods
.method public constructor <init>(Lfz2;Lf61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lez2;->E:Lfz2;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ll66;-><init>(ILf61;)V

    .line 5
    .line 6
    .line 7
    return-void
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


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lbl6;

    .line 2
    .line 3
    check-cast p2, Lf61;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lez2;->o(Lf61;Ljava/lang/Object;)Lf61;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lez2;

    .line 10
    .line 11
    sget-object p1, Lvs7;->a:Lvs7;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lez2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
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
.end method

.method public final o(Lf61;Ljava/lang/Object;)Lf61;
    .locals 1

    .line 1
    new-instance v0, Lez2;

    .line 2
    .line 3
    iget-object p0, p0, Lez2;->E:Lfz2;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lez2;-><init>(Lfz2;Lf61;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, v0, Lez2;->D:Ljava/lang/Object;

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

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lez2;->D:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lbl6;

    .line 4
    .line 5
    iget v1, p0, Lez2;->C:I

    .line 6
    .line 7
    iget-object v2, p0, Lez2;->E:Lfz2;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v4, :cond_0

    .line 14
    .line 15
    iget v1, p0, Lez2;->B:I

    .line 16
    .line 17
    iget v5, p0, Lez2;->A:I

    .line 18
    .line 19
    iget-object v6, p0, Lez2;->z:[I

    .line 20
    .line 21
    iget-object v7, p0, Lez2;->y:Ljava/util/Iterator;

    .line 22
    .line 23
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object p1, v7

    .line 27
    goto :goto_2

    .line 28
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_1
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v2, Lfz2;->a:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    move v1, v3

    .line 45
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_4

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, [I

    .line 56
    .line 57
    move-object v6, v5

    .line 58
    move v5, v1

    .line 59
    move v1, v3

    .line 60
    :goto_1
    array-length v7, v6

    .line 61
    if-ge v1, v7, :cond_3

    .line 62
    .line 63
    invoke-virtual {v2, v5}, Lfz2;->a(I)I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    const/4 v8, -0x1

    .line 68
    if-eq v7, v8, :cond_2

    .line 69
    .line 70
    new-instance v2, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-direct {v2, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lez2;->D:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p1, p0, Lez2;->y:Ljava/util/Iterator;

    .line 78
    .line 79
    iput-object v6, p0, Lez2;->z:[I

    .line 80
    .line 81
    iput v5, p0, Lez2;->A:I

    .line 82
    .line 83
    iput v1, p0, Lez2;->B:I

    .line 84
    .line 85
    iput v4, p0, Lez2;->C:I

    .line 86
    .line 87
    invoke-virtual {v0, p0, v2}, Lbl6;->c(Lf61;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lp81;->w:Lp81;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x6

    .line 94
    .line 95
    add-int/lit8 v5, v5, 0x6

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    move v1, v5

    .line 99
    goto :goto_0

    .line 100
    :cond_4
    sget-object p0, Lvs7;->a:Lvs7;

    .line 101
    .line 102
    return-object p0
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
.end method
