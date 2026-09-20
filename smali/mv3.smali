.class public final Lmv3;
.super Lar7;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# direct methods
.method public constructor <init>(Lkotlin/Metadata;)V
    .locals 9

    .line 1
    invoke-interface {p1}, Lkotlin/Metadata;->d1()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :cond_0
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {p1}, Lkotlin/Metadata;->d2()[Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lrp3;->g([Ljava/lang/String;[Ljava/lang/String;)Lyb5;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, v0, Lyb5;->w:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v3, v1

    .line 22
    check-cast v3, Luo3;

    .line 23
    .line 24
    iget-object v0, v0, Lyb5;->x:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljs5;

    .line 27
    .line 28
    new-instance v1, Lso3;

    .line 29
    .line 30
    invoke-interface {p1}, Lkotlin/Metadata;->mv()[I

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {v1, v2}, Lso3;-><init>([I)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Lso3;

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    const/4 v5, 0x4

    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-direct {v2, v4, v5, v6}, Lso3;-><init>(III)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lso3;->a(Lso3;)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-gez v1, :cond_1

    .line 50
    .line 51
    move v6, v4

    .line 52
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v2, Lau1;

    .line 59
    .line 60
    new-instance v4, Lwv1;

    .line 61
    .line 62
    iget-object v1, v0, Ljs5;->M:Lht5;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-direct {v4, v1}, Lwv1;-><init>(Lht5;)V

    .line 68
    .line 69
    .line 70
    sget-object v5, Li48;->b:Li48;

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    const/16 v8, 0x30

    .line 74
    .line 75
    invoke-direct/range {v2 .. v8}, Lau1;-><init>(Lvq4;Lwv1;Li48;ZLjava/util/List;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v2}, Lh75;->n(Ljs5;Lau1;)Lqu3;

    .line 79
    .line 80
    .line 81
    :cond_2
    new-instance v0, Lso3;

    .line 82
    .line 83
    invoke-interface {p1}, Lkotlin/Metadata;->mv()[I

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-direct {v0, v1}, Lso3;-><init>([I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p1}, Lkotlin/Metadata;->xi()I

    .line 91
    .line 92
    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    return-void
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
.end method
