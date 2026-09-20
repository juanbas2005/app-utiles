.class public final synthetic Lwt4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lis2;


# instance fields
.field public final synthetic w:Lmm7;

.field public final synthetic x:Lyx6;

.field public final synthetic y:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lmm7;Lyx6;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwt4;->w:Lmm7;

    .line 5
    .line 6
    iput-object p2, p0, Lwt4;->x:Lyx6;

    .line 7
    .line 8
    iput-object p3, p0, Lwt4;->y:Ljava/util/Map;

    .line 9
    .line 10
    return-void
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
.method public final C(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lfk;

    .line 2
    .line 3
    check-cast p2, Leg6;

    .line 4
    .line 5
    check-cast p3, Lyt2;

    .line 6
    .line 7
    check-cast p4, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p4, p0, Lwt4;->w:Lmm7;

    .line 13
    .line 14
    iget-object v0, p4, Lmm7;->a:Lin8;

    .line 15
    .line 16
    invoke-virtual {v0}, Lin8;->H0()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object p4, p4, Lmm7;->d:Led5;

    .line 21
    .line 22
    invoke-virtual {p4}, Led5;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    invoke-static {v0, p4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p4

    .line 30
    if-eqz p4, :cond_0

    .line 31
    .line 32
    iget-object p4, p0, Lwt4;->x:Lyx6;

    .line 33
    .line 34
    invoke-virtual {p4}, Lyx6;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result p4

    .line 38
    if-eqz p4, :cond_0

    .line 39
    .line 40
    sget-object p4, Lk54;->A:Lk54;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    sget-object p4, Lk54;->z:Lk54;

    .line 44
    .line 45
    :goto_0
    invoke-static {p4, p3}, Lo55;->p(Lk54;Lyt2;)Lcx0;

    .line 46
    .line 47
    .line 48
    move-result-object p4

    .line 49
    sget-object v0, Lha4;->a:Lt37;

    .line 50
    .line 51
    invoke-virtual {v0, p4}, Lt37;->a(Ljava/lang/Object;)Lju5;

    .line 52
    .line 53
    .line 54
    move-result-object p4

    .line 55
    sget-object v0, Lia4;->a:Lyy0;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Lyy0;->a(Ljava/lang/Object;)Lju5;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    sget-object v0, Llr6;->a:Lyy0;

    .line 62
    .line 63
    invoke-virtual {v0, p2}, Lyy0;->a(Ljava/lang/Object;)Lju5;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object v1, Lhg6;->a:Lyy0;

    .line 68
    .line 69
    new-instance v2, Lpk;

    .line 70
    .line 71
    invoke-direct {v2, p2}, Lpk;-><init>(Leg6;)V

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, Lwt4;->y:Ljava/util/Map;

    .line 75
    .line 76
    invoke-static {v2, p0}, Lsf4;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {v1, p0}, Lyy0;->a(Ljava/lang/Object;)Lju5;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    filled-new-array {p4, p1, v0, p0}, [Lju5;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    new-instance p1, Lyg;

    .line 89
    .line 90
    const/16 p4, 0x14

    .line 91
    .line 92
    invoke-direct {p1, p4, p2}, Lyg;-><init>(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    const p2, -0x67691afc

    .line 96
    .line 97
    .line 98
    invoke-static {p2, p1, p3}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const/16 p2, 0x38

    .line 103
    .line 104
    invoke-static {p0, p1, p3, p2}, Lt49;->d([Lju5;Lgs2;Lyt2;I)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Lvs7;->a:Lvs7;

    .line 108
    .line 109
    return-object p0
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
