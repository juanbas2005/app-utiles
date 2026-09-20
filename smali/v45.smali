.class public final Lv45;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Lz97;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv45;->a:Ljava/lang/Runnable;

    .line 5
    .line 6
    new-instance p1, Lhx4;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    invoke-direct {p1, v0, p0}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lz97;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lz97;-><init>(Lsr2;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lv45;->b:Lz97;

    .line 18
    .line 19
    return-void
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


# virtual methods
.method public final a(Lg30;Lt54;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Lt54;->k()Lin8;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lin8;->G0()Lk54;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Lk54;->w:Lk54;

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance v1, Lr45;

    .line 18
    .line 19
    invoke-direct {v1, p1, p2}, Lr45;-><init>(Lg30;Lt54;)V

    .line 20
    .line 21
    .line 22
    new-instance p2, Lq45;

    .line 23
    .line 24
    invoke-direct {p2, p1, v1}, Lq45;-><init>(Lg30;Lr45;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p1, Lg30;->a:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {p2, v1}, Lq45;->j(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lv45;->b()Lt45;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, Lt45;->c:Lrv4;

    .line 41
    .line 42
    invoke-static {v1, p2}, Lrv4;->a(Lrv4;Ltv4;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Lpm1;

    .line 46
    .line 47
    invoke-direct {v1, p2, p0, v0}, Lpm1;-><init>(Lq45;Lv45;Lin8;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lin8;->x0(Ls54;)V

    .line 51
    .line 52
    .line 53
    new-instance p0, Ls45;

    .line 54
    .line 55
    invoke-direct {p0, v0, v1}, Ls45;-><init>(Lin8;Lpm1;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p1, Lg30;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 59
    .line 60
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

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
.end method

.method public final b()Lt45;
    .locals 0

    .line 1
    iget-object p0, p0, Lv45;->b:Lz97;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz97;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lt45;

    .line 8
    .line 9
    return-object p0
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

.method public final c(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lv45;->b()Lt45;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lt45;->c:Lrv4;

    .line 6
    .line 7
    new-instance v1, Lm45;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p1, v2}, Lo45;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v0, v1, v3}, Lrv4;->c(Lo45;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lv45;->b()Lt45;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p0, p0, Lt45;->c:Lrv4;

    .line 22
    .line 23
    new-instance v0, Lp45;

    .line 24
    .line 25
    const v1, 0xf4240

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, p1, v1}, Lo45;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0, v2}, Lrv4;->c(Lo45;I)V

    .line 32
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
